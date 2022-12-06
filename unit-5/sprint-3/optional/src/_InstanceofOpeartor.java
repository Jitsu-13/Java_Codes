public class _InstanceofOpeartor {
    public static void main(String[] args) {
        Dog8 d =new Dog8();
        System.out.println(d instanceof Dog8);
        System.out.println(d instanceof Animal8);
    }
}
class Animal8{

}
class Dog8 extends Animal8{

}
