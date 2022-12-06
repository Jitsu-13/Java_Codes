public class _Downcating_Example {

    public static void main(String[] args) {
        Main m =new Main();
        m.doSomething(new Animal10());
        m.doSomething(new Dog10());
    }
}
class Animal10{
    void eat(){
        System.out.println("eating");
    }
}
class Dog10 extends Animal10{
    @Override
    void eat(){
        System.out.println("eating Bread");
    }
    void bark(){
        System.out.println("barking");
    }
}
class Main{
    void doSomething(Animal10 a){
        a.eat();
        if(a instanceof Dog10){
            Dog10 d =(Dog10) a;
            d.bark();
        }
    }
}