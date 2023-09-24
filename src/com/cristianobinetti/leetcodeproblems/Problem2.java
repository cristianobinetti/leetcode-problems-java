package com.cristianobinetti.leetcodeproblems;

/*
# 2. Add Two Numbers (https://leetcode.com/problems/add-two-numbers/description/)

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class Problem2 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder num1Str = new StringBuilder();
        StringBuilder num2Str = new StringBuilder();

        int sum = 0;
        String sumStr = "";

        ListNode head = new ListNode();

        for (ListNode node = l1; node != null; node = node.next) {
            num1Str.append(Integer.toString(node.val));
            //num1Str = Integer.toString(node.val) + num1Str;
        }

        for (ListNode node = l2; node != null; node = node.next) {
            num2Str.append(Integer.toString(node.val));
            //num2Str = Integer.toString(node.val) + num2Str;
        }

        try{
            sum = (int) (Integer.parseInt(num1Str.toString()) + Integer.parseInt(num2Str.toString()));
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        sumStr = String.valueOf(sum);
        int i = 0;

        for (ListNode node = head; i < sumStr.length(); node = node.next, i++) {

            node.val = Character.getNumericValue(sumStr.charAt(sumStr.length() - i - 1));

            if (i < sumStr.length() - 1) node.next = new ListNode();
        }

        return head;
    }
}
