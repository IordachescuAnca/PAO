package homework;
import java.util.*;

public class Exercitiu3 {
    public static boolean isPrime(int a){
        for(int i = 2; i*i <= a; i++){
            if(a%i == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]matrix = new int[n][n];
        boolean [][]booleanMatrix = new boolean[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(booleanMatrix[i], false);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                booleanMatrix[i][j] = isPrime(matrix[i][j]);
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(booleanMatrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println("Number of prime numbers: " + Integer.toString(count));

    }
}
