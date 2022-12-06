package question3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Aman","Sujit","Vicky","Suresh","Varun","Samay","Praynesh","Himmatwala","Butler","Jagmani");
        Stream<String> str1=name.stream();
        System.out.println("Names before filtering -");
        System.out.println(name);
        System.out.println("==========================");
        System.out.println("Names After filtering -");
        List<String> list=name.stream().filter(s->s.length()%2==0).collect(Collectors.toList());
        Set<String> set =new TreeSet<>();
        set.addAll(list);
        for(String s:set){
            System.out.println(s.toUpperCase());
        }


    }
}
