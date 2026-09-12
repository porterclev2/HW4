package Composition;

public class File {
    private String name;

    public File(String n) {
        this.name = n;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void print(String indent) {
        System.out.printf("%s%s\n", indent, this.name);
    }
}
