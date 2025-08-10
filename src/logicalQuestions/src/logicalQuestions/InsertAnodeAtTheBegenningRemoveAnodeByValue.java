package logicalQuestions;

import java.util.Arrays;

public class InsertAnodeAtTheBegenningRemoveAnodeByValue {

	public static void main(String[] args) {
	    LinkedList list = new LinkedList();

	    list.add(10);
	    list.add(20);
	    list.add(30);

	    System.out.println("Initial list:");
	    list.display();

	    list.addAtBeginning(5);
	    System.out.println("After adding 5 at beginning:");
	    list.display();

	    list.removeByValue(20);
	    System.out.println("After removing 20:");
	    list.display();

	    list.removeByValue(5);
	    System.out.println("After removing 5 (head):");
	    list.display();

	    list.insertAtIndex(2, 70);
	    System.out.println("After inserting 70 at index 2:");
	    list.display();

	    list.insertAtIndex(3, 80);
	    System.out.println("After inserting 80 at index 3:");
	    list.display();

	    boolean found = list.search(30);
	    System.out.println("Is 30 found? " + found);

	    int len = list.length();
	    System.out.println("Length of the list: " + len);

	    list.reverse();
	    System.out.println("After reversing the list:");
	    list.display();

	    int[] array = list.toArray();
	    System.out.println("List converted to array: " + Arrays.toString(array));
	}
}