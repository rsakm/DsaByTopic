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
        Node prev = null;
        while (slow != null){
            slow = slow.next;
            prev = fast;
            fast = fast.next;


        }
//        remove cycle    fast->prev.next = null
        prev.next = null;
    }
}
