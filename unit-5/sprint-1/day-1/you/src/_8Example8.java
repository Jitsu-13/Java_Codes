interface Intr6{
    int doMultiplication(int num1,int num2);
}
public class _8Example8 {

    public static void fun1(Intr6 i1){
        System.out.println(i1.doMultiplication(5,4));
    };

    public static void main(String[] args) {
//        Intr6 i1=(n1,n2)->n1*n2;
//        fun1(i1);
        // or
        fun1((n1,n2)->n1*n2);
    }
}
