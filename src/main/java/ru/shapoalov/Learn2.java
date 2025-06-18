package ru.shapoalov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learn2 {
    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(3, b);
        ListNode d = new ListNode(2, c);
        ListNode e = new ListNode(1, d);

//        for (; e != null; e = e.next) {
//            System.out.println(e.val);
//        }

        ListNode x = reverseList(e);

        for (; x != null; x = x.next) {
            System.out.println(x.val);
        }


//        System.out.println(reverseList(List.of(1,2,3,4,5,6,7,8,9)));
//        System.out.println(reverseList(List.of(1,2)));
//        System.out.println(reverseList(Collections.EMPTY_LIST));
    }

//    public static List<Integer> reverseList(List<Integer> head) {
//        List<Integer> result = new ArrayList<>(head.size());
//        head.forEach(i -> result.add(head.get(head.size() - i)));
//        return result;
//    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static class ListNode {
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
}