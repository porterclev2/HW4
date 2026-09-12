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
}
