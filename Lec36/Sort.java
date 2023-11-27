package Lec36;

import Lec35.Middle_of_LinkedList.ListNode;

public class Sort {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode mid = middleNode(head);
			ListNode midnext = mid.next;
			mid.next = null;
			ListNode A = sortList(head);
			ListNode B = sortList(midnext);
			return mergeTwoLists(A, B);

		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					Dummy.next = list1;
					list1 = list1.next;
					Dummy = Dummy.next;
				} else {
					Dummy.next = list2;
					list2 = list2.next;
					Dummy = Dummy.next;
				}
			}
			if (list1 == null) {
				Dummy.next = list2;
			}
			if (list2 == null) {
				Dummy.next = list1;
			}
			return temp.next;

		}

		public ListNode middleNode(ListNode head) {

			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;

		}
	}
}
