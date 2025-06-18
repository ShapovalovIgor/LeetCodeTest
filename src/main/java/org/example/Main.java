package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));

        System.out.println(isPalindrome(" "));    }

    public static boolean isPalindrome(String s) {
       s = s.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        int sizeHalf = s.length() / 2;
        for (int i = 0; i < s.length() && (i <= sizeHalf); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}