package _question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Mumbai","Gurgaon","Chennai","Sydney","Paris","London","New York");
        cities.stream().forEach(ele-> System.out.println(ele));
    }
}
