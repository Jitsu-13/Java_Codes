package Interface_WeProble;

public interface _Interface {
    int number=10;
    void print();

    public static void main(String[] args) {
        ConsolePrinter cp =new ConsolePrinter();
        _Interface p1 = new ConsolePrinter();
        _Interface p2 =new FilePrinter();
        cp.print();
        p1.print();
        p2.print();
    }
}
