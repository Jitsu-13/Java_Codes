package Interface_Inheritance;

public class Main implements Showable {
    public void show(){
        System.out.println("Welcome");
    }
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Main obj =new Main();
        obj.show();
        obj.print();
    }
}
