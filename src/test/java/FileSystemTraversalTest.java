import java.io.PrintStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objects.File;

public class FileSystemTraversalTest {

    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);

    public final File root = generateRoot();
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
        File emptyRoot = new File("/", new File[0]);
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

    private File generateRoot() {

        File[] usrChildren = new File[]{ 
            new File("local", new File[0]),
            new File("lib", new File[0]),
            new File("bin", new File[0]),
            new File("include", new File[0])
        };

        File[] usrBinChildren = new File[]{
            new File("bash", new File[0]),
            new File("cat", new File[0]),
            new File("csh", new File[0])
        };

        File[] etcChildren = new File[]{
            new File("hosts", new File[0])
        };

        File[] devChildren = new File[]{
            new File("stty", new File[0])
        };

        File usr = new File("usr", usrChildren);
        usr.children[2].children = usrBinChildren;

        File etc = new File("etc", etcChildren);
        File dev = new File("dev", devChildren); 

        return new File("/", new File[]{ usr, etc, dev });
    }

}
