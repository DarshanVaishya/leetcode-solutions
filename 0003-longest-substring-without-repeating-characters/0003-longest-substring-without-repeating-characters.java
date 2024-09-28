class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int res = 0;
        for(int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            while(seen.contains(currChar)) {
                seen.remove(currChar);
                left++;
            }
            seen.add(currChar);
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}