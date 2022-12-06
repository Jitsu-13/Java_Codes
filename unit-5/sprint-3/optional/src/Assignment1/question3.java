package Assignment1;

public class question3 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 5, 50, 11, 14, 15};
        int[] result = new int[arr.length];
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
//                result[p]=arr[i];
//                p++;
                System.out.println(arr[i]);
            }
        }
    }

    /*public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int[] result = new int[inputArray.length];
        int p=0;
        for(int i=0;i<inputArray.length;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(inputArray[i]%j==0){
                    count++;
                }
            }
            if(count==2) {
                result[p]=inputArray[i];
                p++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        question3 quest=new question3();
        int[] arr = {10,12,5,50,11,14,15};
        quest.findAndReturnPrimeNumbers(arr);
        int[] result=quest.findAndReturnPrimeNumbers(arr);
        if(result.length==0){
            System.out.println("Prime Numbers are not supplied in the array");
        }else{
            for(int i=0;i<result.length;i++){
                System.out.println(result[i]);
            }
        }*/


    }


//}
