interface Intr{
    void sayHello(String name);
}

class x1 implements Intr{
    @Override
    public void sayHello(String name){
        System.out.println("welcome: "+name);
    }
}

public class _2FunctionalProgramming_EX1 {
    public static void main(String[] args) {

        // using external class approach
        Intr res =new x1();
        res.sayHello("Amit");

        // using anonymous inner-with this we don't have to external class
        Intr x2=new Intr(){
            @Override
            public void sayHello(String name){
                System.out.println("hi: "+name);
            }
        };
        x2.sayHello("sumit");
    }
}

