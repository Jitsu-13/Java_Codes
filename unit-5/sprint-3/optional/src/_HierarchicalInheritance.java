public class _HierarchicalInheritance {
    public static void main(String[] args) {
        Dog3 d =new Dog3();
        Cat c = new Cat();
        d.bark();
        d.eat();
        c.meow();
        c.eat();
    }
}
class Animal3{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog3 extends Animal3{
    void bark(){
        System.out.println("bow-bow");
    }
}
class Cat extends Animal3{
    void meow(){
        System.out.println("meowing");
    }
}
