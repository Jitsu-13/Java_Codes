package _question5;

public class Main {
    public static void main(String[] args) {
        X x =s-> Integer.parseInt(s);
        int y=x.convertStringToNumber("100");
        System.out.println(y);

        X x1=Integer::parseInt;
        System.out.println(x1.convertStringToNumber("150"));

    }
}
