package _FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _Example1 {
    public static void main(String[] args) throws IOException {
        File f =new File("d://dummy/a.txt");
        FileReader fr =new FileReader(f);
        char[] chr =new char[(int)f.length()];
        fr.read(chr);
//        String str =new String(chr);
//        System.out.print(str);
        for(char c:chr){
            System.out.print(c);
        }

    }

}
