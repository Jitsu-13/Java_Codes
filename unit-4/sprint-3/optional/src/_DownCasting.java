public class _DownCasting {
    public static void main(String[] args) {
        Animal9 a =new Dog9();
        a.eat();
        Dog9 d =(Dog9) a;
        d.bark();
    }
}
class Animal9{
    void eat(){
        System.out.println("eating");
    }
}
class Dog9 extends Animal9{
    @Override
    void eat(){
        System.out.println("eating Bread");
    }
    void bark(){
        System.out.println("barking");
    }
}