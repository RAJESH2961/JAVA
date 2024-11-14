
import java.io.*;

public class FileSplit {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Input.txt");
        byte[] buffer = new byte[1024];
        int n =2;
        int part=1;
        int bytesRead;
        while((bytesRead = fis.read(buffer))!=-1){
            FileOutputStream fos = new FileOutputStream("input.part"+part++);
            fos.write(buffer, 0, bytesRead);
            fos.close();
        }
        fis.close();
        System.out.println("File Splitted Successfully");
    }
    
}
