import objects.File;

// Given a file pointer, print the full paths of each file and their children.
// Assume a method file.getChildren which returns an array of the top level file objects.

public class FileSystemTraversal {
    // Definition for file object
    // public class File {
    //     public String name;
    //     public File[] children;
    //     public File(String name, File[] children) {
    //         this.name = name;
    //         this.children = children;     
    //     }
    // }
    public static void solution(File root) {
        solutionHelper(root, "");
    }

    private static void solutionHelper(File root, String path) {
        if (root == null) return;
        System.out.printf("%s%s\n", path, root.name);
        for (File child : root.children) {
            if (path == "") {
                solutionHelper(child, path+root.name);
            } else {
                solutionHelper(child, path+root.name+"/");
            }
        }
    }
}