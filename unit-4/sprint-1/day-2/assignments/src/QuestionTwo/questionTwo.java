package QuestionTwo;

public class questionTwo {
    public static void main(String[] args) {

        main val1=new main();
        String cityInput=val1.main();
        switch (cityInput){
            case "Mumbai":
                System.out.println("Financial City");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May be Other Indian City");
        }

    }
}
