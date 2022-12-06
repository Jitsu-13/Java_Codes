import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter f =new FileWriter("d://dummy/a.txt",true);
            f.write(97+"\n");
            f.write("Hello\n World");
            f.write("\n");
            char[] ch ={'a','b','c'};
            f.write(ch);
            f.flush();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("done");

    }
}
