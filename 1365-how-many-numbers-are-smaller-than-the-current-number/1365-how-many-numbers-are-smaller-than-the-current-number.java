class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);
        }
        
        for(int i = 0; i < copy.length; i++) {
            copy[i] = map.get(copy[i]);
        }
        
        return copy;
    }
}