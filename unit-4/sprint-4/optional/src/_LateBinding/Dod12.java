package _LateBinding;

public class Dod12 extends Animal12{
    void eat(){
        System.out.println("Dog is eating...");
    }

    public static void main(String[] args) {
        Animal12 a = new Dod12();
        a.eat();
    }
}
