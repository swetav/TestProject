package logicalQuestions;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileWriter writer = new FileWriter("output.txt");  // Creates or overwrites the file
            writer.write("Hello, this is a test message!\n"); //This is line 1
            writer.write("Writing to a file in Java."); //This is line 2
            writer.close();  // Always close the writer
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
}