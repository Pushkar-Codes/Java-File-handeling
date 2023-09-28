import java.io.File;
import java.io.IOException;

class create_File {
    public static void main(String[] args) throws IOException { //throw used for exception handling
        File f = new File("new1.txt"); //created a new file in the intellij folder

        if(f.createNewFile())
        {
            System.out.println("File has been successfully created!");
        }
        else {
            System.out.println("File already exit!");
        }


    }
}
