package MultipleInheritance;

public class Main {
    public static void main(String[] args) {
        Demo obj =new Demo();
        obj.print();
        obj.show();
        Printable p=new Demo();
        p.print();
        Showable s =new Demo();
        s.show();
    }
}
