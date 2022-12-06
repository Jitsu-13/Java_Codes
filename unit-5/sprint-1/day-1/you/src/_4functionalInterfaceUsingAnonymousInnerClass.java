interface Intr3{
    void sayHello(String name);
}
public class _4functionalInterfaceUsingAnonymousInnerClass {
    public static void main(String[] args) {
        Intr3 i1 =new Intr3(){
            public void sayHello(String name){
                System.out.println("Welcome: "+name);
            }
        };
        i1.sayHello("Sujit");
    }
}
