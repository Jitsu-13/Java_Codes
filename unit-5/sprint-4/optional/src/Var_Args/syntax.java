package Var_Args;

public class syntax {

    static void display(String... value){

        System.out.println("inside display");
    }
    public static void main(String[] args) {
        display();
        display("my","name","is","varargs");
    }
}
