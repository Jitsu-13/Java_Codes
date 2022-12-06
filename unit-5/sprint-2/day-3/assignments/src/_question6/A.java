package _question6;

import java.util.concurrent.Callable;

public class A implements Callable<String> {
    int n;
    A(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        if(n%2!=0){
            System.out.println(n);
            return "Odd Number";
        }else{
            System.out.println(n);
            return "Even Number";
        }
    }
}
