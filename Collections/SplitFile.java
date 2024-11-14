import java.io.*;

public class SplitFile {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Change this if your file is in a different directory
        
        try {
            File inputFile = new File(inputFilePath);
            if (!inputFile.exists()) {
                System.out.println("File not found: " + inputFilePath);
                return;
            }
            
            FileInputStream fis = new FileInputStream(inputFile);
            byte[] buffer = new byte[1024]; // Buffer size of 1 KB
            int part = 1; // Part file counter
            int bytesRead;
            
            System.out.println("Splitting file: " + inputFilePath + " (Size: " + inputFile.length() + " bytes)");

            // Read the file in chunks of 1 KB and write each chunk to a separate file
            while ((bytesRead = fis.read(buffer)) != -1) {
                String partFileName = "input.part" + part;
                FileOutputStream fos = new FileOutputStream(partFileName);
                fos.write(buffer, 0, bytesRead);
                fos.close();
                
                // Print confirmation for each part created
                System.out.println("Created file: " + partFileName + " with " + bytesRead + " bytes.");
                part++;
            }
            
            fis.close();
            System.out.println("File split successfully.");
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
