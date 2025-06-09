package day_03;


	class Node {
	    int data;
	    Node next;

	    
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Task_01 {
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
	        Task_01 list = new Task_01();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        
	        list.traverse();
	    }
	}

