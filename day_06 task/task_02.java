package day_06;

import java.util.Scanner;

public class task_02 {
    static int[] stack = new int[5];
    static int top = -1;

    public static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full (Overflow)");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty (Underflow)");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    public static void display() {
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
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
        } while (choice != 4);
    }
}



