package logicalQuestions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;

public class ReadingFromAFile {
	public static void main(String[] args) {

	String filePath = "/Users/swetaverma/Desktop/abc.txt.rtf";

    try (FileInputStream fis = new FileInputStream(filePath)) {
        RTFEditorKit rtfParser = new RTFEditorKit();
        javax.swing.text.Document doc = rtfParser.createDefaultDocument();
        rtfParser.read(fis, doc, 0);
        String text = doc.getText(0, doc.getLength());
        System.out.println(text);
    } catch (IOException | BadLocationException e) {
        e.printStackTrace();
    }
}
}
