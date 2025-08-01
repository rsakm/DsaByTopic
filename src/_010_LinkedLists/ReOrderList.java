package _010_LinkedLists;

/*
* Leetcode: 143. Reorder List
*
* You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 */
public class ReOrderList {
    public void reorderList(Node head) {
        if (head == null || head.next == null) return;

        // middle
        Node slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reversing the second half
        Node prev = null, curr = slow.next;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        slow.next = null;  // first half

        //Merging
        Node first = head, second = prev;
        while (second != null) {
            Node temp1 = first.next, temp2 = second.next;
            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("The original List: ");
        printList(head);

        new ReOrderList().reorderList(head);
        System.out.println("\nThe re-ordered list: ");

        // Print result
       printList(head);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
