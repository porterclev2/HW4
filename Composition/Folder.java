package Composition;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subfolders;

    public Folder(String n) {
        this.name = n;
        this.files = new ArrayList<File>();
        this.subfolders = new ArrayList<Folder>();
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<File> getFiles() {
        return this.files;
    }

    public ArrayList<Folder> getSubFolders() {
        return this.subfolders;
    }
    
    public File addFile(String filename) {
        File f = new File(filename);
        this.files.add(f);
        return f;
    }

    public void deleteFile(String filename) {
        for (int i = 0; i < this.files.size(); i++) {
            if (this.files.get(i).getName().equals(filename)) {
                this.files.remove(i);
                return;
            }
        }
    }
    
    public Folder addSubFolder(String foldername) {
        Folder f = new Folder(foldername);
        this.subfolders.add(f);
        return f;
    }


    public void deleteSubFolder(String foldername) {
        for (int i = 0; i < this.subfolders.size(); i++) {
            if (this.subfolders.get(i).getName().equals(foldername)) {
                this.subfolders.get(i).deleteContents();
                this.subfolders.remove(i);
                return;
            }
        }
    }

    public void deleteContents() {
        for (Folder sub : this.subfolders) {
            sub.deleteContents();
        }
        this.subfolders.clear();
        this.files.clear();
    }

    public void print(String indent) {
        System.out.printf("%s%s\n", indent, this.name);

        for (Folder sub : this.subfolders) {
            sub.print(indent + "    ");
        }

        for (File f : this.files) {
            f.print(indent + "    ");
        }
    }
}
