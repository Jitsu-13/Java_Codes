import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _BufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fr =new FileWriter("d://dummy/three.txt");
        BufferedWriter bw =new BufferedWriter(fr);
        bw.write("Hello");
        bw.newLine();
        bw.write("World");
        bw.newLine();
        char[] ch={'a','b','c'};
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
