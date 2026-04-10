class Solution {
    public int removeElement(int[] nums, int val) {
        int idxCnt=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=val) {
                nums[idxCnt]=nums[i];
                idxCnt++;
            }
        }
        return idxCnt;
    }
}