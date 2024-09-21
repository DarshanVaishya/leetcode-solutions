class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while(left <= right) {
            while(left < right && !isAlphaNumeric(s.charAt(left))) left++;
            while(left < right && !isAlphaNumeric(s.charAt(right))) right--;

            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}