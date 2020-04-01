package lab4;
import java.util.*;

public class RandomOutTask implements Task {
    public double randomNumber;
    RandomOutTask(){
        this.randomNumber = Math.random();
    }

    @Override
    public void execute() {
        System.out.println(this.randomNumber);
    }
    public static void main(String []args){
        RandomOutTask obj = new RandomOutTask();
        obj.execute();
    }
}
