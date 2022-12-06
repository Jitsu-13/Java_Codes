package _question2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Student[] students={
                new Student(10,"Ryan","San Fransico",300),
                new Student(11,"Sujit","Chandigarh",800),
                new Student(12,"Amir","Paris",500),
                new Student(13,"Salman","Mumbai",600),
                new Student(14,"Shahrukh","Dubai",700),
                new Student(15,"Britney","California",800),
        };
        ExecutorService service=Executors.newFixedThreadPool(3);
        for(Student student:students){
            Future f=service.submit(student);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
