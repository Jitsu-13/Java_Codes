package Stack;
import java.util.Stack;
public class _stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(35);
        stack.push(36);
        stack.push(37);
        System.out.println(stack.push(38));
        System.out.println(stack);
        stack.push(39);
        stack.push(34);
        System.out.println(stack.pop());
        System.out.println(stack);




    }
}
