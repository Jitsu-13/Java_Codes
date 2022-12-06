package _ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        PrintJob[] jobs ={
                new PrintJob("Ram"),
                new PrintJob("Ravi"),
                new PrintJob("Anil"),
                new PrintJob("Shiva"),
                new PrintJob("Pawan"),
                new PrintJob("Suresh")
        };
        ExecutorService service =Executors.newFixedThreadPool(3);
        for(PrintJob job:jobs){
            service.submit(job);
        }
    }
}
