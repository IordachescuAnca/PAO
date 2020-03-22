package exercises;
import java.util.*;
public class Exercitiu3 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder myString = new StringBuilder(input);
        if(myString.length() < 2){
            System.out.println("Error.");
            return;
        }
        if(myString.charAt(0) == myString.charAt(myString.length()-1) && myString.charAt(1) == myString.charAt(myString.length()-2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
