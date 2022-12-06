package Interface_WeProblem;

import Interface_Example.Printer;

public class Main {
    public static void PrintSomething(Printer p){
        p.print();
    }
    public static void main(String[] args) {
        PrintSomething(new ConsolePrinter());
        PrintSomething(new FilePrinter());
    }
}
