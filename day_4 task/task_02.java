package day_04;
class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class task_02 { 
    Node head, tail;

  
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

  
    public void insertAtMiddle(int data) {
        if (head == null) { 
            append(data);
            return;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newNode = new Node(data);
        newNode.next = slow.next;
        newNode.prev = slow;

        if (slow.next != null) {
            slow.next.prev = newNode;
        }

        slow.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

  
    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task_02 list = new task_02();
        list.append(1);
        list.append(2);
        list.append(4);
        list.append(5);

        System.out.println("Before Inserting:");
        list.traverseForward();

        list.insertAtMiddle(3); 

        System.out.println("After Inserting:");
        list.traverseForward();
    }
}
