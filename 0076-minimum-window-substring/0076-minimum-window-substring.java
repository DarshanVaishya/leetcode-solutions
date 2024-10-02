class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map  = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int matched = 0;
        int left = 0; 
        int minLen = s.length() + 1;
        int subStr = 0;

        for(int right = 0; right < s.length(); right++) {
            char rightC = s.charAt(right);
            if(map.containsKey(rightC)) {
                map.put(rightC, map.get(rightC) - 1);
                if(map.get(rightC) == 0) matched++;
            }

            while(matched == map.size()) {
                if(minLen > right - left + 1) {
                    minLen = right - left + 1;
                    subStr = left;
                }

                char deleted = s.charAt(left++);
                if(map.containsKey(deleted)) {
                    if(map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }

        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
    }
}