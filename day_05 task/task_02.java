package day_05;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class task_02 {
    private Node head;
    private Node tail;

    public task_02() {
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
        task_02 cll = new task_02();
        cll.insertAtTail(100);
        cll.insertAtTail(20);
        cll.insertAtTail(30);
        cll.insertAtTail(40);

        cll.display();
    }
}
