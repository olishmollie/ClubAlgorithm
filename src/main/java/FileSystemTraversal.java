// Given a file pointer, print the full paths of each file and their children.
// Assume a method file.getChildren which returns an array of the top level file objects.
class FileSystemTraversal {

    interface File {
        File[] getChildren();
        String name();
    }

    public static void solution(File root) {
        solutionHelper(root, "");
    }

    private static void solutionHelper(File root, String path) {
        if (root == null) return;
        System.out.printf("%s%s\n", path, root.name());
        for (File child : root.getChildren()) {
            solutionHelper(child, path+root.name());
        }
    }
}