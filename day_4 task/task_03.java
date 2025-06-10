package day_04;
class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class task_03 {
    Node head;

    // Function to insert a node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Function to delete a node from the middle
    public void deleteNode(int key) {
        if (head == null)
            return;

        Node temp = head;

        while (temp != null && temp.data != key)
            temp = temp.next;

        // If node to be deleted is found
        if (temp != null) {
            if (temp.prev != null)
                temp.prev.next = temp.next;
            if (temp.next != null)
                temp.next.prev = temp.prev;
            if (temp == head)
                head = temp.next;
        }
    }

    // Function to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task_03 dll = new task_03();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.append(50);

        System.out.println("Original DLL:");
        dll.display();

        dll.deleteNode(30); // Deleting the middle node (30)

        System.out.println("After deletion:");
        dll.display();
    }
}




