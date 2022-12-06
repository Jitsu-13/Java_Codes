import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class _PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("d://dummy/four.txt");
        pw.write(100);
        pw.println(100);
        pw.println("Hello");
        pw.println(true);

        pw.flush();
        pw.close();
    }
}
