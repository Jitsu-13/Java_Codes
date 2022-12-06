package Example;

import java.io.File;

public class Demo {
    public static void readfile(File f){
        File[] files=f.listFiles();
        for(File file:files){
            if(file.isFile()){
                System.out.println(file.getName());
            }else{
                readfile(file);
            }
        }

    }
    public static void main(String[] args) {
        File rootfile =new File("d://Dummy/abc");
        readfile(rootfile);
    }
}
