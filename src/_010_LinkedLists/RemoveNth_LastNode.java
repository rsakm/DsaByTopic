package _010_LinkedLists;

public class RemoveNth_LastNode {
    public static void main(String[] args) {

    }

    public int deleteNthFromEnd(Node head, int n){
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }

        if (size == n){
            // delete head
            int val = head.data;
            head = head.next;
            return val;
        }

        int idx = size - n; // index of the node *before* the one to delete
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

}
