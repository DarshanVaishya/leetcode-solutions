class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> uniques = new HashSet<>();
        
        for(int num : arr) {
            if(uniques.contains(num)) {
                return true;
            }
            uniques.add(num);
        }
        
        return false;
    }
}