public class _Array_YouProblem {
    Integer Student(){
        int[] val={5,10,15,20,25};
        int max=0;
        for(int i=0;i<val.length;i++){
            if(val[i]>max){
                max=val[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _Array_YouProblem s1=new _Array_YouProblem();
        System.out.println(s1.Student());
    }
}
