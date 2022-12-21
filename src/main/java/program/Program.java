package program;

import model.Stack;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Please write 5 lines to add to stack");
        stack.put(scanner.next());
        stack.put(scanner.next());
        stack.put(scanner.next());
        stack.put(scanner.next());
        stack.put(scanner.next());
        System.out.println(stack);
        stack.get();
        System.out.println(stack);
    }
}
