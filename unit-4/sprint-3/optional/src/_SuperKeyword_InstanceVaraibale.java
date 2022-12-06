public class _SuperKeyword_InstanceVaraibale{
    public static void main(String[] args) {
        Dog4 d =new Dog4();
        d.printColor();
    }
}
class Animal4{
    String color="White";
}
class Dog4 extends Animal4{
    String color="Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
