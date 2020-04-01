package lab4_2;

import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();
        Album []arr = new Album[nr];
        for(int i = 0; i < nr; ++i){
            String nume = scanner.next();
            int an = scanner.nextInt();
            double rating = scanner.nextDouble();
            Album obj = new Album(nume, an, rating);
            arr[i] = obj;
        }

        System.out.println("Before sorting");
        for (Album album : arr) {
            System.out.println(album.toString());
        }
        Arrays.sort(arr);
        System.out.println("After sorting");
        for (Album album : arr) {
            System.out.println(album.toString());
        }
    }
}
