package day_03;


	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class task_03 {
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

	    public void deleteAtPosition(int position) {
	        if (head == null || position <= 0) {
	            System.out.println("Invalid position or empty list!");
	            return;
	        }

	        if (position == 1) {
	            head = head.next;
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            System.out.println("Position out of bounds!");
	            return;
	        }

	        temp.next = temp.next.next; 
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
	        task_03 list = new task_03();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        System.out.println("Original List:");
	        list.traverse();

	        list.deleteAtPosition(2);
	        System.out.println("After Deletion at Position 2:");
	        list.traverse();
	    }
	}


