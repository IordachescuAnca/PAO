package lab4;

public class OutTask implements Task {
        String message;
        public OutTask(String message_p){
            this.message = message_p;
        }

    @Override
    public void execute() {
        System.out.println(this.message);
    }

    public static void main(String[] args){
            OutTask obj = new OutTask("This is a message");
            obj.execute();
    }
}
