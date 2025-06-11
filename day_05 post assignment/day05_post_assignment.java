package day05_post_assignment;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class day05_post_assignment {
    private Node head;
    private Node tail;

    public day05_post_assignment() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; 
        }
        System.out.println("Inserted " + data + " at the tail.");
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }

        if (head == tail) { 
            System.out.println("Deleted " + head.data + " from the head.");
            head = null;
            tail = null;
            return;
        }

        System.out.println("Deleted " + head.data + " from the head.");
        head = head.next;
        tail.next = head; 
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }

        if (head == tail) { 
            System.out.println("Deleted " + tail.data + " from the tail.");
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) { 
            temp = temp.next;
        }

        System.out.println("Deleted " + tail.data + " from the tail.");
        temp.next = head; 
        tail = temp; 
    }

    public void display() {
        if (head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {
        day05_post_assignment cll = new day05_post_assignment();
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at Tail");
            System.out.println("2. Delete from Head");
            System.out.println("3. Delete from Tail");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    cll.insertAtTail(data);
                    break;
                case 2:
                    cll.deleteAtHead();
                    break;
                case 3:
                    cll.deleteAtTail();
                    break;
                case 4:
                    cll.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}



