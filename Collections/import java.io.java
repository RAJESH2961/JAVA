import java.io.*;
public class SplitFile {
public static void main(String[] args) throws IOExcep􀆟on {
FileInputStream fis = new FileInputStream("input.txt");
byte[] buffer = new byte[1024];
int n = 2; // Number of parts
int part = 1;
int bytesRead;
while ((bytesRead = fis.read(buffer)) != -1) {
FileOutputStream fos = new FileOutputStream("input.part" + part++);
fos.write(buffer, 0, bytesRead);
fos.close();
}
fis.close();
System.out.println("File split successfully.");
}
}