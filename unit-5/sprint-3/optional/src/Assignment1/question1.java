package Assignment1;

import java.util.*;

public class question1 {
        public static String reversString(String input){
            //write the logic
            String store="";
            for(int i=input.length()-1;i>=0;i--){
                store += input.charAt(i);
            }
            return store;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String to reverse");
            String orignalString = sc.next();
            reversString(orignalString);
            String result = reversString(orignalString);
            System.out.println("Original String is :"+ orignalString);
            System.out.println("Reversed String is :"+ result);
        }
}


