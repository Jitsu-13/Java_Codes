public class _9TwoDArray {
    public static void main(String[] args) {
        int[][] matrix=new int[3][4];
        int[][] a ={
                {1,2,3},
                {4,5,6,9},
                {7}
        };
        System.out.println(a[1][3]);
        int R=a.length;
        for(int row=0;row<R;row++){
            int C=a[row].length;
            for(int colunm=0;colunm<C;colunm++){
                System.out.print(a[row][colunm]);
            }
        }
    }
}
