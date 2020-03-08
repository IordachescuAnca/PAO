package package1;
import java.util.Scanner;

    public class Student{
        private String nume;
        private int nota;
        public Student(){
            this.nume = "";
            this.nota = 0;
        }
        public Student(String nume, int nota){
            this.nume = nume;
            this.nota = nota;
        }
        public void setNume(String nume){
            this.nume = nume;
        }
        public void setNota(int nota){
            this.nota = nota;
        }
        public String getNume(){
            return this.nume;
        }
        public int getNota(){
            return this.nota;
        }
    }