package collectionframework.linkedlist;

// Define the linked list
public class LinkedList {
//    Node class to define the property of Node
    public static class Node{

//        Data and reference of the node
        int data;
        Node next;

//        constructor for the Node to initialise the Node
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//    Declare the head and the tail of the  linked list
    public static Node head;
    public static Node tail;
    public static int size;

//    Add element at the start of the linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

//    Add element at the end of the linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

//    traverse the linked list and print the element
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

//    Add element at an index of the linked list
    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int getSize(Node list){
        int count = 0;
        while(list!=null){
            list = list.next;
            count++;
        }
        return count;
    }

//    Remove element from a linked list
    //Remove First
    public void removeFirst(){
        if(getSize(head)==0){
            System.out.println("No element is in the list!!!");
        } else if (getSize(head) == 1) {
            head = tail = null;
            size--;
            System.out.println("List is empty now!!!");
        }
        else {
            head = head.next;
            size--;
        }
    }

    //Remove First
    public void removeLast(){
        if(getSize(head)==0){
            System.out.println("No element is in the list!!!");
        } else if (getSize(head) == 1) {
            head = tail = null;
            size--;
            System.out.println("List is empty now!!!");
        }
        else {
            Node temp = head;
            while(temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

//    Search from the linked list --> Iteration
    public  int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

//    Search from the linked list --> Recursion
    public  int recSearch(int key){
        return helperFunc(head, key);
    }
    //helperFunc method is used to handle head node otherwise it get updated
    public int helperFunc(Node head, int key){
        if(head == null){
            return -1;
        } else if (head.data == key) {
            return 0;
        }
        int ind = helperFunc(head.next, key);
            if(ind == -1){
                return -1;
            }
            return ind + 1;
    }

//    Reverse linked list
    public void reverse(){
        Node prevNode = null;
        Node currNode = tail = head;
        Node nextNode;

        while (currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

//    Find & Remove Nth Node from end
    // Nth Node from end & delete
    public void deleteNthNodeEnd(int n){
        int linkSize = getSize(head);
        if(n == linkSize){
            head = head.next;
            return;
        }
        deleteNode(linkSize-n);
    }
    public void deleteNode(int index){
        int i = 1;
        Node prev = head;
        while(i<index){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

//    Check the given list is palindrome or not
    public boolean checkPalindrome(){
        // Base case
        if(head == null || head.next == null){
            return true;
        }
        // Find midNode of the List
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node midNode = slow;

        // Reverse 2nd half of the linked list
        Node prevNode = null;
        Node currNode = midNode;
        Node nextNode;

        while (currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        Node right = prevNode;
        Node left = head;

        // Check palindrome
        while(right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

//    Sort the Linked List using the MergeSort Algorithm
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // middle node of ll
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // divide and apply merge sort
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // merge the linked list
        Node mergedLL = new Node(-1); //dummy Node
        Node temp = mergedLL;

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

//    Zig-Zag Linked list
    public void zigZag(){
        // middle node of the linked list
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node nextL, nextR;

        //alternating merging to make zigzag linked list
        while (left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }


//    Main method to run the code
    public static void main(String[] args) {
//      Define the linked list
        LinkedList ll = new LinkedList();

//      Add element in the linked list
        ll.addFirst(31);
        ll.addFirst(22);
        ll.addLast(42);
        ll.addLast(10);
        ll.addLast(80);
        ll.addLast(17);
        ll.addLast(52);


//      Print the linked list
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
