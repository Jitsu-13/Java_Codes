import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class _BufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d://dummy/three.txt");
        BufferedReader br=new BufferedReader(fr);
//        Stream<String> str=br.lines();
//        str.forEach(line-> System.out.println(line));
        br.lines().forEach(line-> System.out.println(line));
//        String str=br.readLine();
//        while(str!=null){
//            System.out.println(str);
//            str= br.readLine();
//        }
    }
}
