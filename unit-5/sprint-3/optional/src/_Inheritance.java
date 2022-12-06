public class _Inheritance {

    public static void main(String[] args) {
        Dog labrador =new Dog();
        labrador.name="Coco";
        labrador.display();

        labrador.eat();
    }
}

class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{

    public void display(){

        System.out.println("My name is"+ name);
    }

}
