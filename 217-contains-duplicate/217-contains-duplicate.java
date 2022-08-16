class Solution {
    public boolean containsDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr) {
            if(map.containsKey(num)) {
                return true;
            }
            
            map.put(num, 1);
        }
        
        return false;
    }
}