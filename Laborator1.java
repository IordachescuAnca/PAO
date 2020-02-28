package package1;

import java.util.Scanner;

public class Laborator1
{
    public void cerinta1(){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       for(int i = 0; i <= n; i+=2){
           System.out.println(i);
       }
        
       sc.close();
    }
    public void cerinta2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a < b){
            System.out.println("a < b");
        }
        else{
            System.out.println("a >= b");
        }
    }
    public void cerinta3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
    public void cerinta4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("Factorial de " + n + " este: " + factorial);
    }
    public boolean cerinta5(int numar){
        int contor = 0;
        for(int i = 1; i <= numar; i++){
            if(numar%i == 0){
                contor++;
            }
        }
        if(contor == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public void cerinta6(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long putere = 1;
        for(int i = 1; i <= b; i++){
            putere *= a;
        }
        System.out.println(putere);
    }
    public void cerinta7(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(1);
            return;
        }
        if(n == 2){
            System.out.println(1);
            return;
        }
        
        int a = 1;
        int b = 1;
        int c = -1;
        for(int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
