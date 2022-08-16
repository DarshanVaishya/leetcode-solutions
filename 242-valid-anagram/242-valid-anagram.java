class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) {
            return false;
        }
        
        // At worst will have a length of 26
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            map.put(charS, map.getOrDefault(charS, 0) + 1);
            map.put(charT, map.getOrDefault(charT, 0) - 1);
        }
        
        for(int count : map.values()) {
            if(count != 0) {
                return false;
            }
        }
        
        return true;
    }
}