import java.util.*;
class PalindromeTester {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();


        Queue<Character> queue = new LinkedList<Character>();

        for(int i=0; i<inputString.length(); i++){
            queue.add(inputString.charAt(i));
        }

        String str2 = "";
        System.out.println("String to Queue by letters");
        while( queue.peek() != null ) {
            str2 = str2 + queue.remove();
            System.out.println(str2);
        }
        //System.out.println(str2);
            Stack stack = new Stack();
        System.out.println("\nString to Stack by letters");
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));

        }

        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
            System.out.println(reverseString);
        }

        if (inputString.equals(reverseString) && inputString.equals(str2))
            System.out.println("\n\nThe input String is a palindrome.");
        else
            System.out.println("\n\nThe input String is not a palindrome.");

    }
}