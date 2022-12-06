package Enum;

public class enum_declared_inside {
    enum Color{
        RED,
        GREEN,
        ORANGE;
        public static void main(String[] args) {
            Color c1= Color.RED;
            System.out.println(c1);
        }

    }
    /*
    public static void main(String[] args) {
        Color c1=Color.GREEN;
        System.out.println(c1);
    }
     */
}
