class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            if( i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];
                
                while(left < right) {
                    int currSum = nums[left] + nums[right];
                    if(currSum == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right - 1] == nums[right]) right--;
                        
                        left++;
                        right--;
                    }
                    else if(currSum < sum) left++;
                    else right--;
                }
            }
        }
        
        return res;
    }
}