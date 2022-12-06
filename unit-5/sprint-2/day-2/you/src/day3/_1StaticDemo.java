package day3;

public class _1StaticDemo {

    // Inside a class there will be two types of elements are there;
    //1. Static Elements -loaded into RAM first
    //2. Non-Static Elements -- loaded into memory only after you create an object using new operator
    /*
    *
    * */

}
class Simple{
    static int s;
    int n;
// As soon as class is loaded , static variable are given default values.
// however, non-static are not given any values,
    public static void main(String[] args) {
        System.out.println(s);
        Simple S1=new Simple();
        // new allocates memory
        System.out.println(S1.n);
    }

}
