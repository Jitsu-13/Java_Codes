package day3;

public class _6NestEggs {
    public static void main(String[] args) {
        Egg egg1=new Egg();
        egg1.color="white";
        egg1.size=2;

        Egg egg2=new Egg();
        egg2.color="pale";
        egg2.size=3;
        
        Nest nest =new Nest();
        nest.color="brown";
        nest.height=100;

        Egg[] arrayofEggs =new Egg[2];
        arrayofEggs[0]=egg1;
        arrayofEggs[1]=egg2;
        nest.eggs=arrayofEggs;
        System.out.println(nest.height);
        
        
    }
}
