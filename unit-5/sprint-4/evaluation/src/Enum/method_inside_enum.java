package Enum;

public class method_inside_enum {
    public enum Item{
        RICE{
            public void info(){
                System.out.println("This is Rice");
            }
        },SALT,SUGAR;
        public void info(){
            System.out.println("This is Rice");
        }
    }

    public static void main(String[] args) {
        Item itr = Item.RICE;

    }
}
