class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ca = s.toCharArray();
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int right = left;
        int length = 0;

        while(right < ca.length) {
            if(seen.contains(ca[right])) {
                length = Math.max(length, right - left);
                seen.clear();
                left++;
                right = left;
            } else {
                seen.add(ca[right]);
                right++;
            }
        }
        length = Math.max(length, right - left);

        return length;
    }
}