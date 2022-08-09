package leetcode.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = lowerCase.length();
        int halfIdx = length / 2;

        for (int i = 0; i < halfIdx; i++) {
            if (lowerCase.charAt(i) != lowerCase.charAt(length - 1 - i))
                return false;
        }

        return true;
    }

}
