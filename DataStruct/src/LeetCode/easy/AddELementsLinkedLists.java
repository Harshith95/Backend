package LeetCode.easy;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */

public class AddELementsLinkedLists {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void print(ListNode node) {
        while (null != node) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (null != curr) {
            ListNode nextNod = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNod;
        }
        return prev;
    }


    public static void main(String[] args) {

        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        print(node1);
        System.out.println();
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(3);
//        print(node2);

//        ListNode reve = reverse(node1);
        addTwoNumbers(node1,node2);
//        print(reve);
    }

    public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        int sum = 0;
        while (null != list1 || null != list2) {
            if (null != list1) {
                System.out.println(list1.val);
                sum += list1.val;
                list1 = list1.next;
            }
            if (null != list2) {
//                System.out.println(list2.val);
                sum += list2.val;
                list2 = list2.next;
            }
        }
        System.out.println(sum);
        return null;
    }
}
