package package1;
import java.util.Scanner;

public class Exercitiu1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
    while(true){
        int value = sc.nextInt();
        if(value == -1) break;
        sum += value;
        i++;
    }
        if(i != 0){
            System.out.println((double)sum/i);
        }
        else{
            System.out.println("Error.");
        }
    }
}
