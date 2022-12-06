import java.util.Arrays;

public class _7TakeandReturnArrayinMethod {

    public static void main(String[] args) {
        Double[] array={1.5,2.5,3.0};
        Double[] outPutArray=doubleTheArray(array);
        System.out.println(outPutArray[1]);
    }

//    Double[] copyOfArray= Arrays.copyOf(array,3);
//    Arrays.sort(array);

    static Double[] doubleTheArray(Double[] array) {
        // you create another, double of the current array
        Double[] newArray = new Double[array.length];
        //return the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;
    }
}
