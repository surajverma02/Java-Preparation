package collectionframework.stack;
import java.util.Stack;

public class StackUsingCF {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);

        System.out.println(stack);
        System.out.println("Element at top is: " + stack.peek());
        System.out.println(stack.size());
        int popItem = stack.pop();
        System.out.println("Popped element is: " + popItem);
        System.out.println(stack);
    }
}
