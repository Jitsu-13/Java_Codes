package _question3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Virat virat=new Virat();
        Dhoni dhoni=new Dhoni();
        Rohit rohit=new Rohit();
        virat.setName("Virat");
        dhoni.setName("Dhoni");
        rohit.setName("Rohit");
        virat.setPriority(Thread.MIN_PRIORITY);
        dhoni.setPriority(Thread.MAX_PRIORITY);
        rohit.setPriority(6);
        virat.start();
        dhoni.start();
        rohit.start();

    }

}
