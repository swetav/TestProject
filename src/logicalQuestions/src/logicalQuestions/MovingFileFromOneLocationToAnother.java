package logicalQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MovingFileFromOneLocationToAnother {
    public static void main(String[] args) {
        // Define correct file paths without unnecessary escape characters
        Path sourcePath = Paths.get("/Users/swetaverma/Desktop/Screen Shot 2025-04-02 at 8.55.44 PM.png");
        Path destinationPath = Paths.get("/Users/swetaverma/Screen Shot 2025-04-02 at 8.55.44 PM.png");

        try {
            // Move file instead of copying
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully");
        } catch (IOException e) {
            System.out.println("Error moving file: " + e.getMessage());
        }
    }
}