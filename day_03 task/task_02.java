package day_03;
class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class task_02 {
    Node head;

    // Method to insert a node at a given position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0) {
            System.out.println("Invalid position! Use 1 or higher.");
            return;
        }

        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to display the linked list
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
        System.out.println("null"); // End of list
    }

    public static void main(String[] args) {
        task_02 list = new task_02();

        // Inserting elements at various positions
        list.insertAtPosition(10, 1); // Insert at head
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(25, 3); // Insert at position 3
        list.insertAtPosition(5, 1);  // Insert at head again

        // Display the linked list
        list.traverse();
    }
}
