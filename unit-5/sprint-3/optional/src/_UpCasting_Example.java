public class _UpCasting_Example {
    public static void main(String[] args) {
        Bike2 b =new Honda();
        System.out.println(b.speedLimit);
    }
}
class Bike2{
    int speedLimit=90;
}
class Honda extends Bike2{
    int speedLimit=150;
}
