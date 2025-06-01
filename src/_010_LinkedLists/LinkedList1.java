package _010_LinkedLists;

public class LinkedList1 {



//    Methods of LinkedList class

    //    1. Add first
    public static Node addFirst(Node head, int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public static void printLl(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

        System.out.print("null");
    }


    public static void main(String[] args) {

        Node head = null;
        head = addFirst(head,40);
        head = addFirst(head,30);
        head = addFirst(head,20);
        head = addFirst(head,10);

        printLl(head);


    }
}
