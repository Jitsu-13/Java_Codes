public class _MethodOveriding {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
    }
}

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{
    @Override
    void run(){
        System.out.println("Bike is running Safely");
    }
}
