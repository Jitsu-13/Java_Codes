import java.util.HashSet;

public class _4Set {
    public static void main(String[] args) {
        HashSet<String>hash=new HashSet<>();
        hash.add("A");
        hash.add("B");
        hash.add("C");
        hash.add("A");
        // add returns true if the item is added to the set, return false otherwise;
        System.out.println(hash);
        System.out.println(hash.contains("D"));

    }
}
