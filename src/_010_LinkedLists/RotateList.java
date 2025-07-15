package _010_LinkedLists;

public class RotateList {
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Count the length of the list
        int length = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Connect tail to head to make it circular
        tail.next = head;

        // Step 3: Find the new tail: (length - k % length) steps ahead
        int stepsToNewTail = length - (k % length);
        Node newTail = tail;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: Break the circle and return new head
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
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

        RotateList solution = new RotateList();
        Node rotated = solution.rotateRight(head, k);

        System.out.println("Rotated List:");
        printList(rotated);
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
}
