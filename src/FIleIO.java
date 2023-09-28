import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FIleIO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("new1.txt"));
            writer.write("Writing to a file");
            writer.close();
        }
        catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
