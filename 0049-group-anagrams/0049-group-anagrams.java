class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();

        Map<String, List> res = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!res.containsKey(key))
                res.put(key, new ArrayList());
            res.get(key).add(strs[i]);
        }

        return new ArrayList(res.values());
    }
}