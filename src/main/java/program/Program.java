package program;

import model.Stack;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static <T> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of your stack content: String or Integer? (s/i)");
        String typeChosen = scanner.nextLine();
        while (!Objects.equals(typeChosen.toLowerCase(), "s") ||
                !Objects.equals(typeChosen.toLowerCase(), "i")){
            if (Objects.equals(typeChosen.toLowerCase(), "s")){
                Stack<String> stackOfStr = new Stack<>();
                System.out.println("Now either fill stack or empty it. Print \"put X\" where X is a String or \"pop\" to " +
                        "pop the last element and see the difference. When you finish, type \"quit\"");
                String input = scanner.nextLine();
                while(!Objects.equals(input.toLowerCase(), "quit")){
                    if (Objects.equals(input.toLowerCase().split(" ")[0], "put")){
                        String inputToStack = input.substring(4);
                        stackOfStr.put(inputToStack);
                        System.out.println("Stack is now like this:\n" + stackOfStr);
                    }
                    else if (Objects.equals(input.toLowerCase(), "pop")){
                        stackOfStr.pop();
                        System.out.println("Stack is now like this:\n" + stackOfStr);
                    }
                    input = scanner.nextLine();
                }
                break;
            } else if (Objects.equals(typeChosen.toLowerCase(), "i")) {
                Stack<Integer> stackOfInt = new Stack<>();
                System.out.println("Now either fill stack or empty it. Print \"put X\" where X is an Integer or \"pop\" to " +
                        "pop the last element and see the difference. When you finish, type \"quit\"");
                String input = scanner.nextLine();
                while(!Objects.equals(input.toLowerCase(), "quit")) {
                    if (Objects.equals(input.toLowerCase().split(" ")[0], "put")) {
                        String inputToStack = input.substring(4);
                        try {
                            stackOfInt.put(Integer.parseInt(inputToStack));
                        }
                        catch (NumberFormatException e){
                            System.out.println("You chose an Integer-type stack! Type only one integer after \"put\"!");
                        }
                        System.out.println("Stack is now like this:\n" + stackOfInt);
                    } else if (Objects.equals(input.toLowerCase(), "pop")) {
                        stackOfInt.pop();
                        System.out.println("Stack is now like this:\n" + stackOfInt);
                    }
                    input = scanner.nextLine();
                }
                break;
            }
            else {
                System.out.println("You are supposed to enter \"s\" or \"i\"!");
                typeChosen = scanner.nextLine();
            }
        }
    }
}
