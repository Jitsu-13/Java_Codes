public class _UpCasting {
    public static void main(String[] args) {
        Bike1 b=new splendor();
        b.run();
    }
}
class Bike1{
    void run(){
        System.out.println("running");
    }
}
class splendor extends Bike1{
    void run(){
        System.out.println("running safely with 60km");
    }
    void stop(){
        System.out.println("stopped");
    }
}