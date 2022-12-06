import java.io.*;

public class _FileStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("d://dummy/1.jpg");
        FileOutputStream fout=new FileOutputStream("d://dummy/2.jpg");
        int i =fis.read();
        while(i!=-1){
            fout.write(i);
            i= fis.read();
        }
        fout.flush();
        fout.close();
        fis.close();
    }
}
