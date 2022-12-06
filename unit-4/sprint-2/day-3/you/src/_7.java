public class _7 {
    public static void main(String[] args) {
        String x="Hi"; //pool
        String y="Hi"; // pool, at the same location
        x.concat(" there");
        System.out.println(x); //here
        // Strings are immutable.
        x="hello";
        System.out.println(x);// hello

    }
}
