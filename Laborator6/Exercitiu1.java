package Laborator6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercitiu1 {
    public static void main(String []args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int numberPairs = sc.nextInt();
        FileWriter file = null;
        try {
            file = new FileWriter("output.txt");
            for (int i = 1; i <= numberPairs; ++i) {
                while (true) {
                    try {
                        System.out.println("Perechea " + i);
                        System.out.println("First number");
                        int firstNumber = sc.nextInt();
                        System.out.println("Second number");
                        int secondNumber = sc.nextInt();
                        if (firstNumber > secondNumber)
                            throw new InvalidInputException("First number is bigger than the second one. Enter the numbers again");
                        file.write(firstNumber + " " + secondNumber + "\n");
                        break;
                    } catch (InputMismatchException exception) {
                        System.out.println("Your data are not numbers. Enter the numbers again");
                        sc.next();
                    } catch (InvalidInputException exception) {
                        System.out.println(exception.getMessage());
                    }
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        }
        catch(IOException exc){
            System.out.println("Error occured.");
        }
        finally {
            if(file != null) {
                System.out.println("It will close the file.");
                try {
                    file.close();
                } catch (IOException exc) {
                    System.out.println("It couldn't close the file");
                }
            }
        }
    }
}
