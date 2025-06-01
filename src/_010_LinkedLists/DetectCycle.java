package _010_LinkedLists;

public class DetectCycle {
    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =head;

        LinkedList1 ll = new LinkedList1();
//        ll.printLl(head);
        System.out.println(isCycle(head));


    }
}
