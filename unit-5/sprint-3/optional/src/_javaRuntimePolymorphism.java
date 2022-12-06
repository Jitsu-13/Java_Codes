public class _javaRuntimePolymorphism {
    public static void main(String[] args) {
        Animal7 a1,a2,a3;
        a1=new Animal7();
        a2=new Dog7();
        a3=new BabyDog7();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
class Animal7{
    void eat(){
        System.out.println("eating");
    }
}
class Dog7 extends Animal7{
    void eat(){
        System.out.println("eating fruits");
    }
}
class BabyDog7 extends Dog7 {
    void eat() {
        System.out.println("drinking milk");
    }
}

