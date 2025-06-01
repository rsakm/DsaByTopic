package _010_LinkedLists;

public class RemoveCycle {

    public static void removeCycle(Node head){
//        detect cycle
        Node slow = head;
        Node fast = head;
        boolean existsCycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                existsCycle = true;
                break;
            }
        }

        if (!existsCycle){
            System.out.println("No cycle found!");
            return;
        }
//        find meeting point
        slow = head;
        Node prev = null;   // to keep track of node before fast
        while (slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;


        }
//        remove cycle    fast->prev.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        DetectCycle dc = new DetectCycle();
        Node head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next =temp;

        LinkedList1 ll = new LinkedList1();
//        ll.printLl(head);
        System.out.println(dc.isCycle(head));

        removeCycle(head);
        System.out.println(dc.isCycle(head));
        ll.printLl(head);

    }
}
