package exercises;
import java.util.*;
public class Exercitiu4 {
    public static boolean isMadeOfDigits(StringBuilder myString){
        for(int i = 0; i < myString.length(); i++){
            if(!Character.isDigit(myString.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder myString = new StringBuilder(input);
        if(isMadeOfDigits(myString)){
            System.out.println("The string is only made of digits.");
        }
        else{
            System.out.println("The string is not only made of digits.");
        }
    }
}
