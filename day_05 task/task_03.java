package day_05;


	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class task_03 {
	    private Node head;
	    private Node tail;

	    public task_03() {
	        this.head = null;
	        this.tail = null;
	    }

	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            tail.next = head; // Making it circular
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Maintaining circularity
	        }
	    }

	    public void deleteAtHead() {
	        if (head == null) {
	            System.out.println("The Circular Linked List is empty.");
	            return;
	        }

	        if (head == tail) { // Only one node in the list
	            head = null;
	            tail = null;
	            return;
	        }

	        head = head.next; // Move head forward
	        tail.next = head; // Maintain circular connection
	    }

	    public void display() {
	        if (head == null) {
	            System.out.println("The Circular Linked List is empty.");
	            return;
	        }
	        Node temp = head;
	        do {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(Back to Head)");
	    }

	    public static void main(String[] args) {
	        task_03 cll = new task_03();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);

	        System.out.println("Original Circular Linked List:");
	        cll.display();

	        cll.deleteAtHead();
	        System.out.println("After deleting at head:");
	        cll.display();
	    }
	}


