package logicalQuestions;


public class CountOfWords {

    public static void main(String[] args) {
    	String str = "mom is lovely";
    	String[] words = str.split("\\s+");
    	System.out.println("Count of words" +  " " + words.length);
    }
}