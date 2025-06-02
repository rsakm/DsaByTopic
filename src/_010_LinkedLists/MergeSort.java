package _010_LinkedLists;

public class MergeSort {
    private static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static Node mergeSort(Node head){

        if (head == null || head.next == null){
            return head;
        }
//        find mid
        Node mid = findMid(head);

        Node rightHead = mid.next;
        mid.next = null;
        Node sortedLeft = mergeSort(head);
        Node sortedRight = mergeSort(rightHead);
        head = merge(sortedLeft,sortedRight);
        return head;

    }

    public static Node merge(Node left, Node right){

        Node mergedLl = new Node(-1);
        Node temp = mergedLl;

        while (left != null && right != null){
            if (left.data <= right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLl.next;
    }
}
