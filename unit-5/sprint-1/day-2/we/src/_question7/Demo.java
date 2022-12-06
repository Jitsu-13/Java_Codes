package _question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> prod =new ArrayList<>();
        prod.add(new Product(10,"Mobile",5,15000));
        prod.add(new Product(12,"Headphone",3,10000));
        prod.add(new Product(15,"Laptop",1,250000));
        prod.add(new Product(16,"Tablet",2,45000));
        prod.add(new Product(20,"PlayStation",3,60000));
        System.out.println(prod);
        System.out.println("====================================");
        Collections.sort(prod,(p1,p2)-> p1.getPrice()<p2.getPrice() ? +1:-1);
        System.out.println(prod);
    }
}
