package homework;
import java.util.*;
public class Exercitiu2 {
    public static boolean isPalindrom(StringBuilder myString){
        for(int i = 0; i < myString.length()/2; i++){
            if(myString.charAt(i) != myString.charAt(myString.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder arr[] = new StringBuilder[n];

        for(int i = 0; i < n; i++){
            String input = scanner.nextLine();
            arr[i] = new StringBuilder(input);
        }

        int numberPalindroms = 0;
        int maximSizePalindrom = 0;
        int index = -1;
        StringBuilder arrPalindroms[] = new StringBuilder[n];
        for(int i = 0; i < n; i++){
            if(isPalindrom(arr[i])){
                arrPalindroms[numberPalindroms] = arr[i];
                numberPalindroms++;
                if(maximSizePalindrom < arr[i].length()){
                    maximSizePalindrom = arr[i].length();
                    index = i;
                }
            }
        }

        System.out.println("The palindroms:\n");
        for(int i = 0; i < numberPalindroms; i++){
            System.out.println(arrPalindroms[i].toString());
        }
        System.out.println("The palindrom with the maximum size: " + arr[index].toString());

    }
}
