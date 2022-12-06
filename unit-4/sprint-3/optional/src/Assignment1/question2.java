package Assignment1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class question2 {

    public static void TwoDArray(int N, int M, int[][] new_array){

        for(int j=0;j<M;j++){
            int sum=0;
            for(int i=0;i<N;i++){
                if(new_array[i][j]%2==0){
                    sum += new_array[i][j];
                }
            }
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the row-N");
        int N=s.nextInt();
        System.out.println("Please enter the column-M");
        int M=s.nextInt();
        int[][] new_array=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.println("Enter the element");
                int ele=s.nextInt();
                new_array[i][j]=ele;
            }
        }
        TwoDArray(N,M,new_array);
    }
}
