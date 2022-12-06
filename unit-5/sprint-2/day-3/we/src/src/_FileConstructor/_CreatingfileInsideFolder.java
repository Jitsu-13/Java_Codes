package _FileConstructor;

import java.io.File;
import java.io.IOException;

public class _CreatingfileInsideFolder {
    public static void main(String[] args) throws IOException {
        File f =new File("d://Dummy/1","one.txt");
        f.createNewFile();

        File f1 =new File("d://Dummy/one");
        File f2 =new File(f1,"Val");
        f2.mkdir();
    }

}
