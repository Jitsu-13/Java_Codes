public class _UpCasting_WeProblme {
    public static void main(String[] args) {
        Bank2 b1 =new SBI1();
        Bank2 b2 =new ICICI1();
        Bank2 b3 =new AXIS1();
        b1.getRateOfInterest();
        b2.getRateOfInterest();
        b3.getRateOfInterest();

    }
}
class Bank2{
    void getRateOfInterest(){
        System.out.println("0");
    }
}
class SBI1 extends Bank2{
    void getRateOfInterest(){
        System.out.println("7");
    }
}
class ICICI1 extends Bank2{
    void getRateOfInterest(){
        System.out.println("9");
    }
}class AXIS1 extends Bank2{
    void getRateOfInterest(){
        System.out.println("8");
    }
}


