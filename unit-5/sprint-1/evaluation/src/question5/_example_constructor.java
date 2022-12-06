package question5;

public class _example_constructor {
    _example_constructor(String p){
        System.out.println("Bye "+p);
    }

    public static void main(String[] args) {
        Intr s =_example_constructor::new;
        s.country("Australia");
    }
}
