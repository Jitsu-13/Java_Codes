public class _6ArrayWeProblem {

    public static void main(String[] args) {
        int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
        int a = numbers.length;
        int sum=0;
        for(int i=0;i<a;i++){
            sum +=numbers[i];
        }
        System.out.println(sum);
        System.out.println(sum/a);
    }
}
