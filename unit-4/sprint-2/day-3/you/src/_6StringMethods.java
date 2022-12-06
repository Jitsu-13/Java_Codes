import java.util.Locale;

public class _6StringMethods {
    public static void main(String[] args) {
        String s=" H i   ";
        System.out.println(s.trim());
        s.length();
        String a="this time a bigger one";
        a.replace('t','T');
        a.toLowerCase();
        a.toUpperCase();
        String subStringofA=a.substring(12);
        System.out.println(subStringofA);
        System.out.println(a.substring(5,9));
        // first index (5) is included, last index (9) is excluded;
        System.out.println(a.indexOf('i'));
        a.lastIndexOf('g');
    }
}
