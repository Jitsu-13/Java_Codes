package _FilesinJava;

import java.io.File;
import java.io.IOException;

public class _Files {
    public static void main(String[] args) {
//        File f =new File("empty.txt");
//        boolean jhanda=f.createNewFile();
//        if(jhanda){
//            System.out.println("created");
//        }else{
//            System.out.println("not created");
//        }
//        System.out.println(f);
//        System.out.println(f.exists());

//        File f2 =new File("D://Dummy/abc.txt");
//        f2.createNewFile();

        File f3 =new File("d://Dummy/1");
        boolean flag=f3.mkdir();
        if(flag){
            System.out.println("File Created.."+flag);
        }else{
            System.out.println("not created");
        }
//        File f=new File("d://a1.txt");
//        try {
//            boolean flag=f.createNewFile();
//            System.out.println("File Created.."+flag);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
