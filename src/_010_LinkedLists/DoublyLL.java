package _010_LinkedLists;

public class DoublyLL {
    class Node{
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


//    methods

    ///Add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail= newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public int removeFirst(){
        if (head == null){
            System.out.println("Empty list!");
            return Integer.MIN_VALUE;
        }

        if (size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;

    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        System.out.println(dl.size);
        dl.addFirst(8);
        dl.addFirst(3);
        dl.addFirst(9);
        dl.addFirst(6);

        dl.print();
        System.out.println(dl.size);
        dl.removeFirst();
        dl.print();
        System.out.println(dl.size);
        dl.reverse();
        dl.print();
    }
}
