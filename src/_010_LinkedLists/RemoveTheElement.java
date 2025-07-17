package _010_LinkedLists;

public class RemoveTheElement {
    public static Node removeElements(Node head, int val) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;

        //removing elements
        while (current.next != null) {
            if (current.next.data == val) {
                // Skip the node with the given value
                current.next = current.next.next;
            } else {
                // Moving to the next node
                current = current.next;
            }
        }

        // Returning the new head (might be different if head itself was removed)
        return dummy.next;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" → ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Creating the list 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        System.out.println("Original List:");
        printList(head);

        Node newHead = removeElements(head,k);

        System.out.println("Rotated List:");
        printList(newHead);
    }
}
