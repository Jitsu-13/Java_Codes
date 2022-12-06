package Assignment1;

public class question4 {
    public static void main(String[] args) {
        int factorial=1;
        int num=Integer.parseInt(args[0]);
        if(args.length>2){
            System.out.println("Error");
            return;
        }else if(args.length==2){
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            int res=Math.abs(num1-num2);
            for(int i=1;i<=res;i++){
                factorial *=i;
            }
            System.out.println(factorial);
            return;
        }else{
            int num1=Integer.parseInt(args[0]);
            for(int i=1;i<=num1;i++){
                factorial *=i;
            }
            System.out.println(factorial);
            return;
        }
    }
}
