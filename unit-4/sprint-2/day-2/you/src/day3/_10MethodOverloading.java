package day3;

public class _10MethodOverloading {
    public static void hi(){
        System.out.println("hi");
    }
    public static void hi(String name){
        System.out.println("hi "+name);
    }
    public static void hi(String name,String place){
        System.out.println("hi " +name+" how is it going in "+ place);
    }
    public static void main(String[] args){
        hi("Suresh");
        hi("suresh","shimla");
    }
}
