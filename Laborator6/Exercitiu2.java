package Laborator6;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;

public class Exercitiu2 {
    public static StringBuilder readLine(FileInputStream file) throws IOException {
        StringBuilder tempString = new StringBuilder();
        int character = 0;
        while((character = file.read()) != '\n'){
            if(character == -1){
                if(tempString.length() == 0) return null;
                break;
            }
            tempString.append((char)character);
        }
        tempString.deleteCharAt(tempString.length()-1);
        return tempString;
    }
    public static String esteInFisier(String username, String password) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/Laborator6/parole.txt");
            StringBuilder temp = null;
            boolean usernameGasit = false;
            while ((temp = readLine(file)) != null) {
                String[] input = temp.toString().split(" ");
                if (input.length == 2) {
                    if (input[0].compareTo(username) == 0 && input[1].compareTo(password) == 0) {
                        return "Acces permis";
                    }
                    if (input[0].compareTo(username) == 0) {
                        usernameGasit = true;
                    }
                }
            }
            if (usernameGasit) return "Parola gresita";
        }
        catch(IOException exc){
            System.out.println("Eroare");
        }
        finally {
            try{
                if(file != null) file.close();
            }
            catch (IOException exc){
                System.out.println("Eroare");
            }
        }
        return "Nu este in fisier";
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for(int incercare = 1; incercare <= 5; incercare++){
            System.out.println("Introduce username");
            String username = sc.nextLine();
            System.out.println("Introduce password");
            String password = sc.nextLine();
            String verificare = esteInFisier(username, password);
            System.out.println(verificare);
            if(verificare.compareTo("Acces permis") == 0){
                return;
            }
            else if(verificare.compareTo("Parola gresita") == 0){
                for(int incercareParola = 3; incercareParola >= 1; incercareParola--){
                    System.out.println("Ai gresit parola. Mai ai " + incercareParola + " incercari");
                    String parolaNoua = sc.nextLine();
                    String verificaNouaParola = esteInFisier(username, parolaNoua);
                    if(verificaNouaParola.compareTo("Acces permis") == 0){
                        System.out.println(verificaNouaParola);
                        return;
                    }
                }
                System.out.println("Nu mai ai incercari. Trebuie sa reintroduci username si password");
            }
        }
        System.out.println("Cont blocat");
    }
}
