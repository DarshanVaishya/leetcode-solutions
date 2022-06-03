class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < index.length; i++) {
            temp.add(index[i], nums[i]);
        }
        
        int[] ans = new int[temp.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = temp.get(i);
        }
        
        return ans;
    }
}