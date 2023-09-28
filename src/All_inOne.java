//creating a file
//writing in file
//reading the file
//deleting the file
//--------------------------//


/* import java.io.File;
import java.io.IOException;

public class All_inOne {
    public static void main(String[] args) {

        File myFile = new File("TestFile.txt");

        try {
            myFile.createNewFile();
            System.out.println("File created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
} */


/* import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class All_inOne {
    public static void main(String[] args) {

        File myFile = new File("TestFile.txt");

        try {
            FileWriter fileWrite = new FileWriter("TstFie.txt");
            fileWrite.write("Text has been added in the file using JAVA code...!");
            fileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} */

/* import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class All_inOne {
    public static void main(String[] args) {

        File myFile = new File("TestFile.txt");

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
} */

/* import java.io.File;

public class All_inOne {
    public static void main(String[] args) {

        File myFile = new File("TestFile.txt");

        if(myFile.delete()) {
            System.out.println("I have deleted: "+myFile.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
} */










