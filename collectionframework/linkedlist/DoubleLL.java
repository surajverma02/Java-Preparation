package collectionframework.linkedlist;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//    add Node in linked list at starting
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

//    remove first node from linked list
    public void removeFirst(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        if (size == 1){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

//    print linked list
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

//    reverse the doubly linked list
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(3);
        dll.addFirst(5);
        dll.addFirst(9);
        dll.addFirst(11);
        dll.addFirst(13);
        dll.removeFirst();
        dll.addFirst(7);

        dll.print();
        dll.reverse();
        dll.print();
    }
}
