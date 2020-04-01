package lab4;

public class CounterOutTask implements Task {
    public static int number;
    public CounterOutTask(){
        number = 0;
    }

    @Override
    public void execute() {
        number++;
        System.out.println(number);
    }

    public static void main(String []args){
        CounterOutTask obj = new CounterOutTask();
        obj.execute();
    }
}
