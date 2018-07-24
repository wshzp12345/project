package com.albert._2;

public class Solution {


    int i1, i2, carry;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwo(l1, l2, 0);
    }

    /**
     * if node is null then change to use zero to do addition
     * add two node's value with carry。 cache carry(0 or 1).
     * recursion next
     * recursion end if l1 is null, l2 is null and carry is zero
     *
     * @param l1
     * @param l2
     * @param i
     * @return
     */
    private ListNode addTwo(ListNode l1, ListNode l2, int i) {
        ListNode cur = null;
        if (l1 == null && l2 == null && i == 0) {
            return null;
        } else {
            i1 = getVal(l1);
            i2 = getVal(l2);
            int result = i + i1 + i2;
            carry = caryy(result);
            l1 = nextNode(l1);
            l2 = nextNode(l2);
            if (cur == null) {
                cur = build(result);
//                return  cur;
            }
            ListNode n = addTwo(l1, l2, carry);
            if (n != null)
                cur.next = n;

            return cur;
        }
    }

    private ListNode nextNode(ListNode l1) {
        if (l1 == null)
            return null;
        else
            return l1.next;
    }

    private int getVal(ListNode l2) {
        int i2;
        if (l2 == null) {
            i2 = 0;
        } else {
            i2 = l2.val;
        }
        return i2;
    }

    private int caryy(int r) {
        int carry;
        if (r > 10) {
            r -= 10;
            carry = 1;
        } else {
            carry = 0;
        }
        return carry;
    }

    private ListNode build(int r) {
        int carry = caryy(r);
        ListNode next = new ListNode(r);
        return next;
    }
}
