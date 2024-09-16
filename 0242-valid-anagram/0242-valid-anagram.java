class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            count.put(charS, count.getOrDefault(charS, 0) + 1);
            count.put(charT, count.getOrDefault(charT, 0) - 1);
        }

        for(int val : count.values()) {
            if(val != 0) return false;
        }
        return true;
    }
}