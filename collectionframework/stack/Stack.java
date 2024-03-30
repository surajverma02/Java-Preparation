package collectionframework.stack;

public class Stack {
    int maxSize;
    int[] stackArray;
    int top;

//    constructor to create stack
    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

//    push: add element to stack
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full, cannot push!");
            return;
        }
        stackArray[++top] = data;
    }

//    pop: remove element from stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty, cannot pop!");
            return Integer.MIN_VALUE;
        }
        return stackArray[top--];
    }

//    peek: see top element of stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty, cannot peek!");
            return Integer.MIN_VALUE;
        }
        return stackArray[top];
    }

//    isFull: check stack is full or not
    public boolean isFull(){
        return (top == maxSize-1);
    }

//    isEmpty: check stack is empty or not
    public boolean isEmpty(){
        return (top == -1);
    }

//    size: number of element in stack
    public int size(){
        return (top + 1);
    }

//    print stack
    public void print(){
        for (int i=0; i<size(); i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

//    Main method to implement the stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.print("Stack is: ");
        stack.print();
        System.out.println("Size os stack is: " + stack.size());
        System.out.println("Element at top is: " + stack.peek());
        int popItem = stack.pop();
        System.out.println("Popped element is: " + popItem);
        System.out.print("Stack is: ");
        stack.print();

    }
}
