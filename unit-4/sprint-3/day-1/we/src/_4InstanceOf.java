public class _4InstanceOf {

    public static void main(String[] args) {
        Animal animal=new Animal();
        takeAnimal(animal);

        Elephant elephant=new Elephant();
        takeAnimal(elephant);
        Fish fish =new Fish();
        takeAnimal(fish);
    }
    static void takeAnimal(Animal animal){
        animal.speak();
        if( animal instanceof Fish){
            Fish f1 =(Fish) animal;
            f1.swim();
        }
//        Fish fish =new Fish();
//        fish.swim();
    }
}
class Animal{
    void speak(){
        System.out.println("animal speak");
    }
}
class Elephant extends Animal{

}
class Fish extends Animal{
    void swim(){
        System.out.println("fish swims");
    }
}
