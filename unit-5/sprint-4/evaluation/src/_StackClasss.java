import java.util.Stack;

public class _StackClasss {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.pop();
        System.out.println(stack);
        for(String s:stack){
            System.out.println(s);
        }
    }
}
