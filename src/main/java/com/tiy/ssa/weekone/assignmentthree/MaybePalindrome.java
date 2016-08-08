package com.tiy.ssa.weekone.assignmentthree;

public class MaybePalindrome {

    final String value;

    public MaybePalindrome(String value) {

        this.value = value;
    }

    public boolean isPalindrome() {

        String reverse = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            reverse += value.charAt(i);

        }
        return value.equals(reverse);
    }

    @Override
    public String toString() {
        return this.value + isPalindrome() != null ? "is" : "isn't" + "a palindrome";
    }
}
