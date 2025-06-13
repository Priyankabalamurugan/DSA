package day_06;

public class task_01 {
    int[] stack = new int[5];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full (Overflow)");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty (Underflow)");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        task_01 s = new task_01();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}

	