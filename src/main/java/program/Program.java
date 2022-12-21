package program;

import model.Queue;
import model.Stack;
import util.Util;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new Queue<>();
        System.out.println("Enter 3 strings for a new stack");
        stack.put(scanner.next());
        stack.put(scanner.next());
        stack.put(scanner.next());
        System.out.println(stack);
        System.out.println("Now we use get on stack. See what changed");
        stack.get();
        System.out.println(stack);
        System.out.println("Enter 3 strings for a new queue");
        queue.put(scanner.next());
        queue.put(scanner.next());
        queue.put(scanner.next());
        System.out.println(queue);
        System.out.println("Now we use get on queue. See what changed");
        queue.get();
        System.out.println(queue);
        System.out.println("Now we calculate factorial of a big number. Enter such a big number");
        System.out.println("Its factorial is: " + Util.bigFactorial(scanner.nextInt()));
    }
}
