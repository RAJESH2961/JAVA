import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            // Creating PrintWriter object to write to console
            PrintWriter writer = new PrintWriter(System.out);

            // Printing some text
            writer.println("Hello, World!");
            writer.print("This is printed without a newline.");
            writer.printf("Formatted value: %.2f", 3.14159);

            // Flushing the stream (although it's not required here, it's good practice)
            writer.flush();

            // Writing to a file using PrintWriter
            PrintWriter fileWriter = new PrintWriter("output.txt");
            fileWriter.println("This text is to a file.");

            // Closing the PrintWriter
            fileWriter.close();

            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
