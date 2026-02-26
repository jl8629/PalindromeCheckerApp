import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        StringBuilder dequeueResult = new StringBuilder();
        StringBuilder popResult = new StringBuilder();

        while (!queue.isEmpty()) {
            dequeueResult.append(queue.remove());
        }

        while (!stack.isEmpty()) {
            popResult.append(stack.pop());
        }

        System.out.println("Queue (FIFO - Dequeue): " + dequeueResult.toString());
        System.out.println("Stack (LIFO - Pop): " + popResult.toString());

        if (dequeueResult.toString().equals(popResult.reverse().toString())) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}