import java.io.File;

public class file_info {
    public static void main(String[] args) {
        File f = new File("new1.txt");

        if(f.exists()) {
            System.out.println("File name: "+f.getName());
            System.out.println("File location: "+f.getAbsolutePath());
            System.out.println("File writable: "+f.canWrite());
            System.out.println("File readable: "+f.canRead());
            System.out.println("File size: "+f.length());
        }

        else {
            System.out.println("File does not exit!");
        }
    }
}
