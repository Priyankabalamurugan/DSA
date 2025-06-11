package day05_main_project;

class day05_main_project {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;


    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    
    static void delete(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
       
        if (position == 1) {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
           
            if (head.next == head) {
                head = null;
            } else {
                last.next = head.next;
                head = head.next;
            }
            return;
        }

       
        Node prev = null;
        int count = 1;
        while (temp.next != head && count < position) {
            prev = temp;
            temp = temp.next;
            count++;
        }

 
        if (count < position) {
            System.out.println("Position out of bounds.");
            return;
        }

        prev.next = temp.next;
    }


    static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);

        System.out.println("Circular Linked List:");
        display();

        System.out.println("\nDeleting node at position 3:");
        delete(2);
        display();

        System.out.println("\nDeleting node at position 1:");
        delete(1);
        display();
    }
}
