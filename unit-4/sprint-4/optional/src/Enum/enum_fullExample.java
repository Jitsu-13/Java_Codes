package Enum;
import java.lang.*;

public class enum_fullExample {
    public void printCity(City_class.City city){
        if(city!=null){
            System.out.println("our service is available");
            city.message();
            System.out.println(city.numberofTowers);
        }
        else{
            System.out.println("invalid city");
        }
    }
    public static void main(String[] args) {
        enum_fullExample m1=new enum_fullExample();
        m1.printCity(City_class.City.CHENNAI);
    }

}
class City_class{
    public enum City{
        DELHI{
            public void message(){
                System.out.println("welcome user...");
                System.out.println("you are in capital");
            }
        },
        MUMBAI,
        CHENNAI("50 towers"),
        KOLKATA;
        public String numberofTowers;
        City(){
            this.numberofTowers="100 towers";
        }
        City(String numberofTowers){
            this.numberofTowers=numberofTowers;
        }
        public void message(){
            System.out.println("welcome user...");
        }
    }
}
