public class _5StringDemo {

    public static void main(String[] args) {
        Integer i; //declaration
        i=10; // intialization

        String name;
        name="Putin";
        String plant1="snake plant";// String literal stored in perm gen area in (string pool);

        String plant2=new String("rose");
        //string using new operator stored on heap memory
        String plant3="snake plant";

        String plant4=new String("rose");
        System.out.println(plant2==plant4);
    }
}
