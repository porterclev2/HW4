package Composition;

public class Main {
    public static void main(String[] args) {
        Folder php_demo1 = new Folder("php_demo1");

        Folder source_files = php_demo1.addSubFolder("Source Files");
        php_demo1.addSubFolder("Include Path");
        php_demo1.addSubFolder("Remote Files");

        source_files.addSubFolder(".phalcon");

        Folder app = source_files.addSubFolder("app");
        app.addSubFolder("config");
        app.addSubFolder("controllers");
        app.addSubFolder("library");
        app.addSubFolder("migrations");
        app.addSubFolder("models");
        app.addSubFolder("views");

        source_files.addSubFolder("cache");
        source_files.addSubFolder("public");

        source_files.addFile(".htaccess");
        source_files.addFile(".htrouter.php");
        source_files.addFile("index.html");

        System.out.println("Original");
        php_demo1.print("");

        source_files.deleteSubFolder("app");
        System.out.println("\nDelete app...");
        php_demo1.print("");

        source_files.deleteSubFolder("public");
        System.out.println("\nDelete public...");
        php_demo1.print("");
    }
}
