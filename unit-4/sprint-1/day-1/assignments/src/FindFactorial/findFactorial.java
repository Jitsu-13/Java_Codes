package FindFactorial;

public class findFactorial {
    public static void main(String[] args){
        int num=4;
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

}
