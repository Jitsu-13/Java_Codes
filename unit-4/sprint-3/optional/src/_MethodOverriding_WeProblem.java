public class _MethodOverriding_WeProblem {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i =new ICICI();
        Axis a = new Axis();
        System.out.println("SBI rate of Interest is: "+ s.getRateofInterest());
        System.out.println("ICICI rate of Interest is: "+ i.getRateofInterest());
        System.out.println("AXIS rate of Interest is: "+ a.getRateofInterest());
    }
}
class Bank{
    int getRateofInterest(){
        return 0;
    }
}
class SBI extends Bank{
    @Override
    int getRateofInterest(){
        return 8;
    }

}
class ICICI extends Bank{
    @Override
    int getRateofInterest(){
        return 7;
    }
}
class Axis extends Bank{
    @Override
    int getRateofInterest(){
        return 9;
    }
}
