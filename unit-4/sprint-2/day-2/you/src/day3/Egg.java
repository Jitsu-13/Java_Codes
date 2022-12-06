package day3;

public class Egg {
    String color;
    int size;
    Egg(){
        System.out.println("hell");
    }
    // overloaded constructor aka parametrixed
    Egg(String colorofEgg, int sizeofEgg){
        color=colorofEgg;
        this.size=sizeofEgg;
        System.out.println(color+size);
    }
}
