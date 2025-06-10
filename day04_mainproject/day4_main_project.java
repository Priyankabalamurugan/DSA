package day04_main_project;

class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class day4_main_project {
    Node head, tail;
public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
public void traverseForward() {
        Node temp = head;
        System.out.print("Forward Traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
public void traverseBackward() {
        Node temp = tail;
        System.out.print("Backward Traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
 public static void main(String[] args) {
        day4_main_project dll = new day4_main_project();
        dll.append(10);
        dll.append(200);
        dll.append(30);
        dll.append(400);
        dll.append(500);

        dll.traverseForward();
        dll.traverseBackward();
    }
}
