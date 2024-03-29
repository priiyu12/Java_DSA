package Unit2;

import java.util.Scanner;

public class StackArray {
    static int size = 0;
    static int top = -1;
    static int[] stack = new int[5];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int ch;
        do{
            System.out.println("Choose: \n1.Push \n2.Pop \n3.Peek \n4.Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid choice! Choose Again");
            }
        }while (true);

    }

    public static void push(){
        if(isFull()){
            System.out.println("Stack OverFlow!");
            return;
        }
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        stack[size++] = val;
        System.out.println(val + " pushed into stack successfully");
        top++;
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow!");
            return;
        }
        System.out.println(stack[top] + " popped from stack successfully");
        top--;
        size--;

    }
    public static void peek(){
        if(isFull()){
            System.out.println("Stack OverFlow!");
            return;
        } else if (isEmpty()) {
            System.out.println("Stack UnderFlow!");
            return;
        } else {
            System.out.println(stack[top]);
        }
    }
    static boolean isFull(){
        return size == stack.length;
    }
    static boolean isEmpty(){
        return stack == 0;
    }
}
