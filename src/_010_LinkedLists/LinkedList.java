package _010_LinkedLists;

public class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size;


//    Methods of LinkedList class

//    1. Add to beginning

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
//        if list is empty
        if (head == null){
            head = tail = newNode;     /// first element of the linked list
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }


//    2.. Add to end  (Either traverse from head to last ---- O(n) or if access to the tail then just add the newNode to the next of the tail
    public void addLast(int data){
        Node newNode = new Node(data);

        size++;
//        if the ll is empty
        if (head == null){
            head  = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

//3.    Print the ll
    public void printLL(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

//    4.    Add in the middle
    public void addAtPos(int index, int data){
        Node newNode = new Node(data);
        size++;
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < index-1){
            temp = temp.next;
            i++;
        }

//        temp is at prev of index, insert new node
        newNode.next = temp.next;
        temp.next = newNode;

    }

//    5: remove first
    public int removeFirst(){
        if (size == 0){
            System.out.println("List is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

//    6: remove last
    public int removeLast(){
        if (size == 0){
            System.out.println("List is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head=tail = null;
            size--;
            return val;

        }

//        prev of tail should be null--- prev = size-2;
        Node prev = head;
        for (int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

//    7: search (iterative)
    public int searchIterative(int key){
        int i =0;
        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                return  i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

//    8: search recursive
    public int recursiveSearch(int key){
        return Searchhelper(head,key);
    }
    public int Searchhelper(Node head, int key){

        if (head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = Searchhelper(head.next,key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }

//    reverse iterative
    public void reverse(){

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10); // 10
        ll.addFirst(5);  // 5 -> 10
        ll.addLast(20);  // 5 -> 10 -> 20
        ll.addLast(30);  // 5 -> 10 -> 20 -> 30
        ll.addAtPos(3,25);
        ll.addAtPos(2,15);
        ll.addAtPos(0,1);
        ll.addAtPos(7,35);
        ll.printLL();
        System.out.println("Size of the list is: "+ll.size);

        ll.removeFirst();
        ll.printLL();
        System.out.println("Size of the list is: "+ll.size);

        ll.removeLast();
        ll.printLL();
        System.out.println("Size of the list is: "+ll.size);


        System.out.println(ll.searchIterative(5));
        System.out.println(ll.searchIterative(15));
        System.out.println(ll.searchIterative(30));
        System.out.println(ll.searchIterative(45));

        ll.reverse();
        ll.printLL();
    }
}
