package package1;

import java.util.Scanner;

public class Exercitiu4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student vector[] = new Student[n+1];
        
        for(int i = 0; i < n; i++){
            String[] line = sc.nextLine().split("-");
            String nume = line[0];
            int nota = Integer.parseInt(line[1]);
            vector[i] = new Student(nume, nota);
        }
        for(int i = 0; i < n; i++){
            System.out.println(vector[i].getNume() + "-" + vector[i].getNota());
        }
    }
}