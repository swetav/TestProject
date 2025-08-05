package logicalQuestions;

public class InsertAnodeAtTheBegenningRemoveAnodeByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Initial list:");
        list.display();  // 10 -> 20 -> 30 -> null

        list.addAtBeginning(5);
        System.out.println("After adding 5 at beginning:");
        list.display();  // 5 -> 10 -> 20 -> 30 -> null

        list.removeByValue(20);
        System.out.println("After removing 20:");
        list.display();  // 5 -> 10 -> 30 -> null

        list.removeByValue(5);
        System.out.println("After removing 5 (head):");
        list.display();  // 10 -> 30 -> null
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

