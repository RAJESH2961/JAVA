import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("filename.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // Converting byte to char and printing
            }
            fis.close();
            System.out.println("File Closed");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
