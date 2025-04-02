package logicalQuestions;

import java.io.FileInputStream;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="I am reading the text file";
		
		try {
		FileInputStream file = new FileInputStream("/Users/swetaverma/Desktop/BasicJava/Abc.java");		
		
		int i;
		while((i = file.read())!=-1) 
		{
		System.out.print((char)i);	
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
