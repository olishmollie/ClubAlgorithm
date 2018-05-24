package objects;

public class File {
    public String name;
    public File[] children;
    public File(String name, File[] children) {
        this.name = name;
        this.children = children;     
    }
}
