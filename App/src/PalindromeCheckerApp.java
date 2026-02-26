import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    private String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public boolean checkPalindrome(String input) {
        String processed = normalize(input);

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < processed.length(); i++)
            stack.push(processed.charAt(i));

        for(int i = 0; i < processed.length(); i++) {
            if(processed.charAt(i) != stack.pop())
                return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if(checker.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}