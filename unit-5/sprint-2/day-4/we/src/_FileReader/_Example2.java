package _FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _Example2 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("d://dummy/a.txt");
        int f =fr.read();
        while(f!=-1){
            System.out.print((char)f);
            f=fr.read();
        }
    }
}
