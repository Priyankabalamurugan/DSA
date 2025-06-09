package day03_main_project;


	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class day03_main_project {
	    Node head;

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    public void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        while (current != null) {
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next;
	        }
	        head = prev; 
	    }

	    
	    public void traverse() {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("The linked list is empty.");
	            return;
	        }

	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null"); 
	    }

	    public static void main(String[] args) {
	        day03_main_project list = new day03_main_project();

	        
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        System.out.println("Original List:");
	        list.traverse();

	        
	        list.reverse();
	        System.out.println("Reversed List:");
	        list.traverse();
	    }
	}
