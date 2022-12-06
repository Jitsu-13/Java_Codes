package Var_Args;

public class accessing_ele_of_varargs {
    static void display(String... values){
        System.out.println("display method revoked");
        for(String s:values){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        display();
        display("My","name","is","var-args");
    }

    // accessing the element from var-args

}
