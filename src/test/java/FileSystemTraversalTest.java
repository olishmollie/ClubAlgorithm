import java.io.PrintStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileSystemTraversalTest {

    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);

    private class MockFile implements FileSystemTraversal.File {
        private String name;
        private MockFile[] children;

        public MockFile(String name, MockFile[] children) {
            this.name = name;
            this.children = children;     
        }

        public String name() {
            return this.name;
        }

        public MockFile[] getChildren() {
            return this.children;
        }
    }

    public final MockFile root = generateRoot();
    public final String newLine = System.lineSeparator();

    @Before public void setup() {
        //Prepare to redirect output
        System.setOut(this.ps);
    }

    @After public void teardown() {
        System.setOut(System.out);
    }

    @Test public void nullCase() {
        FileSystemTraversal.solution(null);
        assertEquals("solution should handle the null case.", "", os.toString());
    }

    @Test public void emptyRoot() {
        MockFile emptyRoot = new MockFile("/", new MockFile[0]);
        FileSystemTraversal.solution(emptyRoot);
        assertEquals("solution should handle an empty root directory.", "/"+newLine, os.toString());
    }

    @Test public void generalCase() {
        String want = String.join(newLine,
            "/",
            "/usr",
            "/usr/local",
            "/usr/lib",
            "/usr/bin",
            "/usr/bin/bash",
            "/usr/bin/cat",
            "/usr/bin/csh",
            "/usr/include",
            "/etc",
            "/etc/hosts",
            "/dev",
            "/dev/stty"
        );
        FileSystemTraversal.solution(root);
        assertEquals(want+newLine, os.toString());
    }

    private MockFile generateRoot() {

        MockFile[] usrChildren = new MockFile[]{ 
            new MockFile("local", new MockFile[0]),
            new MockFile("lib", new MockFile[0]),
            new MockFile("bin", new MockFile[0]),
            new MockFile("include", new MockFile[0])
        };

        MockFile[] usrBinChildren = new MockFile[]{
            new MockFile("bash", new MockFile[0]),
            new MockFile("cat", new MockFile[0]),
            new MockFile("csh", new MockFile[0])
        };

        MockFile[] etcChildren = new MockFile[]{
            new MockFile("hosts", new MockFile[0])
        };

        MockFile[] devChildren = new MockFile[]{
            new MockFile("stty", new MockFile[0])
        };

        MockFile usr = new MockFile("usr", usrChildren);
        usr.children[2].children = usrBinChildren;

        MockFile etc = new MockFile("etc", etcChildren);
        MockFile dev = new MockFile("dev", devChildren); 

        return new MockFile("/", new MockFile[]{ usr, etc, dev });
    }

}
