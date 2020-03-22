package exercises;
import java.util.*;

public class Exercitiu1 {
    public static Character getFirstNonRepeatingElement(StringBuilder myString){
        int count[] = new int[256];
        Arrays.fill(count, 0);
        Character returnValue = Character.MIN_VALUE;
        for(int i = 0; i < myString.length(); i++){
            count[myString.charAt(i)]++;
        }
        for(int i = 0; i < myString.length(); i++){
            if(count[myString.charAt(i)] == 1){
                returnValue = myString.charAt(i);
                break;
            }
        }
        return returnValue;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder myString = new StringBuilder(input);
        if(getFirstNonRepeatingElement(myString) != Character.MIN_VALUE){
            System.out.println(getFirstNonRepeatingElement(myString).charValue());
        }
    }
}
