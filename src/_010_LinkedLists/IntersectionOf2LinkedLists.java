package _010_LinkedLists;

public class IntersectionOf2LinkedLists {
        public Node getIntersectionNode(Node headA, Node headB) {
            if (headA == null || headB == null) return null;

            Node pA = headA;
            Node pB = headB;

            while (pA != pB) {
                pA = (pA == null) ? headB : pA.next;
                pB = (pB == null) ? headA : pB.next;
            }

            return pA; // Can be the intersection node or null
        }

}
