import java.util.Scanner;
public class _4nextLine {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your full name");
        //.next() - will read only the first word, stops at whitespace;
        String full_Name=scanner.nextLine(); // reads the entire it stops at a newline \n
        System.out.println(full_Name);
        scanner.close();
    }
}
