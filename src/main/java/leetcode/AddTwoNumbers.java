package leetcode;

/**
 * @author hochenchong
 * @date 2023-08-12
 * <p>
 * @link <a href="https://leetcode.cn/problems/add-two-numbers/">https://leetcode.cn/problems/add-two-numbers/</a>
 * <p>
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class AddTwoNumbers {
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbersDemo(ListNode l1, ListNode l2) {
        return null;
    }

    /*
    思路：
        同时遍历，只要节点不为空，或者进位值不为空，则继续计算
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, next = null;
        int v1,v2,p = 0;
        while (l1 != null || l2 != null || p != 0) {
            v1 = l1 != null ? l1.val : 0;
            v2 = l2 != null ? l2.val : 0;
            int sum = v1 + v2 + p;
            p = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (result == null) {
                result = new ListNode(sum % 10);
                next = result;
            } else {
                next.next = new ListNode(sum % 10);
                next = next.next;
            }
        }
        return result;
    }

    /*
     * 使用递归的方式
     */
    public ListNode addTwoNumbersByRecursive(ListNode l1, ListNode l2) {
        return addTwoNumbersByRecursive(l1, l2, 0);
    }

    private ListNode addTwoNumbersByRecursive(ListNode l1, ListNode l2, int p) {
        if (l1 == null && l2 == null && p == 0) {
            return null;
        }
        ListNode result = new ListNode();
        if (l1 != null) {
            p += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            p += l2.val;
            l2 = l2.next;
        }
        result.val = p % 10;
        p = p / 10;
        result.next = addTwoNumbersByRecursive(l1, l2, p);
        return result;
    }
}
