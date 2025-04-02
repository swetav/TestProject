package logicalQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromAFile {

	public static void main(String[] args) {
		// Reading from a File
		
		try (BufferedReader reader = new BufferedReader(new FileReader("/Users/swetaverma/Desktop/abc.txt.rtf"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}