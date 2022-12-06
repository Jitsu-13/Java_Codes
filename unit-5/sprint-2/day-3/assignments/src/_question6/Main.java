package _question6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        A[] jobs={
                new A(10),
                new A(15),
                new A(13),
                new A(12),
                new A(19),
        };
        ExecutorService service=Executors.newFixedThreadPool(3);
        for(A job:jobs){
            Future f=service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
