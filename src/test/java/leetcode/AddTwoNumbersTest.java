package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        AddTwoNumbers.ListNode l1 = listToListNode(Arrays.asList(2, 4, 3));
        AddTwoNumbers.ListNode l2 = listToListNode(Arrays.asList(5, 6, 4));
        Assertions.assertEquals("708", listNodeToString(new AddTwoNumbers().addTwoNumbers(l1, l2)));

        l1 = listToListNode(Arrays.asList(0));
        l2 = listToListNode(Arrays.asList(0));
        Assertions.assertEquals("0", listNodeToString(new AddTwoNumbers().addTwoNumbers(l1, l2)));

        l1 = listToListNode(Arrays.asList(9,9,9,9,9,9,9));
        l2 = listToListNode(Arrays.asList(9,9,9,9));
        Assertions.assertEquals("89990001", listNodeToString(new AddTwoNumbers().addTwoNumbers(l1, l2)));
    }

    @Test
    void addTwoNumbersByRecursive() {
        AddTwoNumbers.ListNode l1 = listToListNode(Arrays.asList(2, 4, 3));
        AddTwoNumbers.ListNode l2 = listToListNode(Arrays.asList(5, 6, 4));
        Assertions.assertEquals("708", listNodeToString(new AddTwoNumbers().addTwoNumbersByRecursive(l1, l2)));

        l1 = listToListNode(Arrays.asList(0));
        l2 = listToListNode(Arrays.asList(0));
        Assertions.assertEquals("0", listNodeToString(new AddTwoNumbers().addTwoNumbersByRecursive(l1, l2)));

        l1 = listToListNode(Arrays.asList(9,9,9,9,9,9,9));
        l2 = listToListNode(Arrays.asList(9,9,9,9));
        Assertions.assertEquals("89990001", listNodeToString(new AddTwoNumbers().addTwoNumbersByRecursive(l1, l2)));
    }

    private String listNodeToString(AddTwoNumbers.ListNode listNode) {
        StringBuilder builder = new StringBuilder();
        AddTwoNumbers.ListNode tmp = listNode;
        while (tmp != null) {
            builder.append(tmp.val);
            tmp = tmp.next;
        }
        return builder.toString();
    }

    public AddTwoNumbers.ListNode listToListNode(List<Integer> list) {
        AddTwoNumbers.ListNode node = null;
        AddTwoNumbers.ListNode next = null;
        for (int i = 0; i < list.size(); i++) {
            if (node == null) {
                node = new AddTwoNumbers.ListNode(list.get(i));
                next = node;
            } else {
                next.next = new AddTwoNumbers.ListNode(list.get(i));
                next = next.next;
            }
        }
        return node;
    }
}