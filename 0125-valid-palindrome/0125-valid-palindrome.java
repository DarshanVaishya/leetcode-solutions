class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()) {
            if(c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        char[] ca = sb.toString().toCharArray();
        int left = 0;
        int right = ca.length - 1;

        while(left <= right) {
            if(ca[left] != ca[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}