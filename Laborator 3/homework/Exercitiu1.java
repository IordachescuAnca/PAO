package homework;
import java.lang.reflect.Array;
import java.util.*;
public class Exercitiu1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        StringBuilder myStr1 = new StringBuilder(str1);
        String str2 = scanner.nextLine();
        StringBuilder myStr2 = new StringBuilder(str2);

        int count1[] = new int[256];
        Arrays.fill(count1, 0);
        int count2[] = new int[256];
        Arrays.fill(count2, 0);

        for(int i = 0; i < myStr1.length(); i++){
            count1[myStr1.charAt(i)]++;
        }
        for(int i = 0; i < myStr2.length(); i++){
            count2[myStr2.charAt(i)]++;
        }

        for(int i = 0; i < 256; i++){
            if(count1[i] != count2[i]){
                System.out.println("No anagrams.");
                return;
            }
        }

        System.out.println("Anagrams.");

    }
}
