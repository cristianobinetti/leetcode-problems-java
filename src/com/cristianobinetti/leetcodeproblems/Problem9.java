package com.cristianobinetti.leetcodeproblems;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class Problem9 {

    public boolean isPalindromeA(int x) {

        String numStr = Integer.toString(x);
        String reverseStr = new String();

        for (int i = 0; i < numStr.length(); i++){

            reverseStr += numStr.charAt(numStr.length() - i - 1);

        }
        if (numStr.equals(reverseStr)) return true;
        else return false;
    }

    public static boolean isPalindromeB(int x) {

        if (x < 0) return false;
        else {
            int num = x;
            int rev_num = 0;

            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }
            System.out.println(x);
            System.out.println(rev_num);
            if (x == rev_num) return true;
            else return false;
        }
    }
}
