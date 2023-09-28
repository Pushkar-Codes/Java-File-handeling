import java.io.*;
public class WriteClass {
    public static void main (String args[]) throws IOException {
        byte cities[] = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'D', 'R', 'A', 'S'};

        FileOutputStream outfile = null;
        try {
            outfile = new FileOutputStream("City.txt");
            outfile.write(cities);
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            outfile.close();
        }
    }
}
