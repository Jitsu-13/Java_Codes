package _MethofFileClass;

import java.io.File;

public class String_List {
    public static void main(String[] args) {
        File f =new File("d://Dummy");
        String[] list=f.list();
        for(String li:list){
            System.out.println(li);
        }
    }
}
