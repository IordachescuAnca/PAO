package Laborator6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercitiu3 {
    public static void main(String []args){
        FileReader file = null;
        List<Client> minori = new ArrayList<Client>();
        List<Client> majori = new ArrayList<Client>();
        try{
            file = new FileReader("src/Laborator6/clienti.txt");
            BufferedReader reader = new BufferedReader(file);
            String temp = "";
            while((temp = reader.readLine()) != null){
                String arg[] = temp.split(" ");
                Client clientNou = new Client(arg[0], arg[1], Integer.parseInt(arg[2]));
                if(Integer.parseInt(arg[2]) < 18){
                    minori.add(clientNou);
                }
                else{
                    majori.add(clientNou);
                }
            }
            System.out.println("Numarul clientilor majori: " + majori.size());
            for(Client c: majori){
                System.out.println(c.toString());
            }
            System.out.println("Numar clienti minori: " + minori.size());
        }
        catch (IOException exc){
            System.out.println("Eroare");
        }
        finally {
            if(file != null){
                try{
                    file.close();
                }
                catch (IOException exc){
                    System.out.println("Eroare la inchiderea fisierului");
                }
            }
        }
    }
}
