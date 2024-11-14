import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("input.txt");
             FileOutputStream outputStream = new FileOutputStream("output.txt")) {

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
