package collectionframework.stack;

public class StackUsingLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//    push()
    public void push(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
//    pop()
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty, cannot pop!");
            return Integer.MIN_VALUE;
        }
        int poppedItem = head.data;
        head = head.next;
        size--;
        return poppedItem;
    }
//    peek()
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
//    isEmpty()
    public boolean isEmpty(){
        return (head == null);
    }

//    print()
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);

        System.out.print("Stack is: ");
        stack.print();
        System.out.println("Size os stack is: " + size);
        System.out.println("Element at top is: " + stack.peek());
        int popItem = stack.pop();
        System.out.println("Popped element is: " + popItem);
        System.out.print("Updated Stack is: ");
        stack.print();
    }
}
