public class _5ArrayDemo {
    public static void main(String[] args) {
        //declare
        //<datatype>[]  -syntax
        int [] arrayName;
        //initilization
            //1st way
            int[] a={1,2,3};
            // 2nd way -<datatype>[] <arrayName>=new <datatype>[size]
            boolean[] b= new boolean[5]; // [false,false,false,false,false]
            //arrays will have int with default values;
//        System.out.println(a[3]);
        System.out.println(a[0]);
        // iterating over an array;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // another way, foreach loop aka enhanced for loop;
        for(Integer item:a){
            System.out.println(item*2);
        }
    }

}
