package Var_Arg;

public class Main {

    static void fun1(int...i){
        System.out.println("inside fun1 of Main");
    }

    public static void main(String[] args) {
        fun1(10,20,50);
    }
}
