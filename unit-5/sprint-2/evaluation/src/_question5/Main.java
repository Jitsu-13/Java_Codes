package _question5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader f =new FileReader("d://dummy/three.txt");
        BufferedReader br=new BufferedReader(f);
        PrintWriter pw =new PrintWriter("d://dummy/eight.txt");
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            pw.println(line);
            line= br.readLine();
        }
        pw.flush();
        pw.close();


    }
}
