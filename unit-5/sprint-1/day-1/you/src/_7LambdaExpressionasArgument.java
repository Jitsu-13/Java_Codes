interface Calculator{
    int calculate(int a,int b);
}
public class _7LambdaExpressionasArgument {
    public static void main(String[] args) {
        Calculator plusOperation=(a,b)->a+b;
        Calculator minusOperation=(a,b)->a-b;
        System.out.println(plusOperation.calculate(10,50));
        System.out.println(minusOperation.calculate(12,5));
    }
}
