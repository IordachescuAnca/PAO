package exercises;
import java.util.*;

public class Exercitiu2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder myString = new StringBuilder(input);
        boolean isPalindrome = true;
        for(int i = 0; i < myString.length()/2; i++){
            if(myString.charAt(i) != myString.charAt(myString.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("The string is palindrome.");
        else System.out.println("The string is not palindrome.");
    }
}
