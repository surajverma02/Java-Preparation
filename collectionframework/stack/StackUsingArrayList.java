package collectionframework.stack;

import java.util.ArrayList;

public class StackUsingArrayList<T> {
    public ArrayList<T> stack;
    public StackUsingArrayList(){
        this.stack = new ArrayList<>();
    }

//    push()
    public void push(T data){
        stack.add(data);
    }

//    pop()
    public T pop(){
        T top = stack.getLast();
        stack.removeLast();
        return top;
    }
//    peek()
    public T peek(){
        return stack.getLast();
    }
//    isEmpty()
    public boolean isEmpty(){
        return stack.isEmpty();
    }
//    size()
    public int size(){
        return stack.size();
    }

//    print()
    public void print(){
        for(int i=0; i<size(); i++){
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();

        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);

        System.out.print("Stack is: ");
        stack.print();
        System.out.println("Size os stack is: " + stack.size());
        System.out.println("Element at top is: " + stack.peek());
        int popItem = stack.pop();
        System.out.println("Popped element is: " + popItem);
        System.out.print("Updated Stack is: ");
        stack.print();

    }
}
