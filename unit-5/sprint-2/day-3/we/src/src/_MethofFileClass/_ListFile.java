package _MethofFileClass;

import java.io.File;

public class _ListFile {
    public static void main(String[] args) {
        File f =new File("d://Dummy");
        File[] list=f.listFiles();
        for(File li:list){
            System.out.println(li);
        }
    }
}
