package collectionframework.linkedlist;

public class testLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    public static void main(String[] args) {
        testLL ll = new testLL();
        ll.head = new Node(1);
    }
}
