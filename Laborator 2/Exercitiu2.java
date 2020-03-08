package package1;
import java.util.Scanner;

public class Exercitiu2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr1[] = new int[100];
        int arr2[] = new int[100];
        int lung1 = 0;
        int lung2 = 0;
        
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            if(value%2 == 1){
                arr1[lung1] = value;
                lung1++;
            }
            else{
                arr2[lung2] = value;
                lung2++;
            }
        }
        if(lung1 < lung2){
            System.out.println("Vectorul cu elemente pare");
            for(int i = 0; i < lung2;i++){
                System.out.println(arr2[i]);
            }
        }
        else{
            System.out.println("Vectorul cu elemente impare");
            for(int i = 0; i < lung1;i++){
                System.out.println(arr1[i]);
            }
        }
}
}