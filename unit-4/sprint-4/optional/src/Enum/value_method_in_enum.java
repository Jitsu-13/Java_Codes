package Enum;

public class value_method_in_enum {
    enum Color{
        RED,
        GREEN,
        BLUE;
    }

    public static void main(String[] args) {
        Color arr[]=Color.values();
//        System.out.println(arr[1]);
        for(Color col : arr){
            System.out.println(col+" "+"at index"+" "+col.ordinal());
        }
    }
}
