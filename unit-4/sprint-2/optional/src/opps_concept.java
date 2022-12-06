public class opps_concept {
    int z=150;
    void fun1(){
        System.out.println("Inside the demo");
    }

        public static void main(String[] args) {
            // we cannot create nested method in java
            /*like void fun1(){
                System.out.println("Inside the demo class");
            } */
            int x=100;
            System.out.println(x);
//            System.out.println(z); - we cannot access non-static members from static.
            opps_concept d1= new opps_concept();
//            we can load the nonstatic members dynamically in RAM.
            System.out.println(d1.z);
            d1.fun1();
    }
}
