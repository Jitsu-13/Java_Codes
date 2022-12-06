import java.util.Stack;

public class _2Stack {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(15);
        stack.push(25);
        System.out.println(stack.pop());
        stack.pop();
        if(!stack.isEmpty()){
            stack.pop();
        }
        // if (stack.size());
        stack.peek();
    }
}
