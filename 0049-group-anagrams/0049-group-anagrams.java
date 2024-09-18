class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, ArrayList> res = new HashMap<>();
        
        for(String s : strs) {
            char[] count = new char[26];
            for(char c : s.toCharArray())
                count[c - 'a']++;

            String key = String.valueOf(count);
            if(!res.containsKey(key))
                res.put(key, new ArrayList());
            res.get(key).add(s);
        }

        return new ArrayList(res.values());
    }
}