package day03_post_assignment;


	import java.util.Scanner;

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class SinglyLinkedList {
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

	    public void delete(int data) {
	        if (head == null) {
	            System.out.println("List is empty! Cannot delete.");
	            return;
	        }

	        if (head.data == data) {
	            head = head.next;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null && temp.next.data != data) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Element not found!");
	        } else {
	            temp.next = temp.next.next;
	        }
	    }

    public void display() {
	        if (head == null) {
	            System.out.println("The linked list is empty.");
	            return;
	        }

	        Node temp = head;
	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null"); 
	    }
	}

	public class day03_post_assignment {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        SinglyLinkedList list = new SinglyLinkedList();

	        while (true) {
	            System.out.println("\nMENU:");
	            System.out.println("1. Insert Element");
	            System.out.println("2. Delete Element");
	            System.out.println("3. Display List");
	            System.out.println("4. Exit");

	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to insert: ");
	                    int insertValue = scanner.nextInt();
	                    list.insert(insertValue);
	                    break;
	                case 2:
	                    System.out.print("Enter element to delete: ");
	                    int deleteValue = scanner.nextInt();
	                    list.delete(deleteValue);
	                    break;
	                case 3:
	                    list.display();
	                    break;
	                case 4:
	                    System.out.println("Exiting... Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please select a valid option.");
	            }
	        }
	    }
	}


