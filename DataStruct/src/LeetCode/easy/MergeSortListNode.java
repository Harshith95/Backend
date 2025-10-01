package LeetCode.easy;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 *
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
 * 
 * Example 2: Input: list1 = [], list2 = [] Output: []
 * 
 * Example 3: Input: list1 = [], list2 = [0] Output: [0]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {
 *      this.val = val; 
 *     }
 *     ListNode(int val, ListNode next) {
 *      this.val = val; this.next = next; 
 *     }
 * }
 */
public class MergeSortListNode {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode lNode = new ListNode(0);
		ListNode currNode = lNode;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				currNode.next = list1;
				list1 = list1.next;
				System.out.println("When first list is less than second");
			} else {
				currNode.next = list2;
				list2 = list2.next;
				System.out.println("When second list is less than first");
			}
			currNode = currNode.next;
		}
		if (list1 != null) {
			currNode.next = list1;
			list1 = list1.next;
		}
		if (list2 != null) {
			currNode.next = list2;
			list2 = list2.next;
		}
		return lNode.next;
	}

	static void printList(ListNode lNode) {
		while (lNode != null) {
			System.out.println(lNode.val);
			lNode = lNode.next;
		}

	}

	public static void main(String[] args) {

		// 1 -> 3 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(5);
		// printList(head);
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(1);
		head1.next.next = new ListNode(1);
		// printList(head1);

		ListNode res = mergeTwoLists(head, head1);
		printList(res);

	}

}
