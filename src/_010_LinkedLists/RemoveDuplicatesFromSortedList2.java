package _010_LinkedLists;

public class RemoveDuplicatesFromSortedList2 {
    public static Node deleteDuplicates(Node head) {
        if (head == null) return null;

        // Create dummy node and manually link it
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node current = head;

        while (current != null) {
            boolean isDuplicate = false;

            // Detect duplicates
            while (current.next != null && current.data == current.next.data) {
                current = current.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                // Skip all nodes with the duplicate value
                current = current.next;
                prev.next = current;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return dummy.next;
    }

    // Utility method to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        // Input: [1, 2, 3, 3, 4, 4, 5]
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        Node result = deleteDuplicates(head);

        System.out.print("After Removing All Duplicates: ");
        printList(result);
    }
}
