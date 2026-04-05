class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int n = Math.min(nums.length,target);
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<=i; j++) {
                if(nums[i]+nums[j]==target && i!=j) {
                    ans[0]=j;
                    ans[1]=i;
                    return ans;
                }
            }
        }
        return ans;
    }
}