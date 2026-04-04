class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int m = n/2;
        boolean isEven = n%2==0;
        if(isEven) {
            for(int i=0; i<(m); i++) {
                if(!(map.containsKey(nums[i])||map.containsKey(nums[n-1-i])) && nums[i]!=nums[n-1-i]) {
                    map.put(nums[i],1);
                    map.put(nums[n-1-i],1);
                    continue;
                }
                return true;
            }
        } else {
            for(int i=0; i<m; i++) {
                if(!(map.containsKey(nums[i])||map.containsKey(nums[n-1-i])) && nums[i]!=nums[n-1-i]) {
                    map.put(nums[i],1);
                    map.put(nums[n-1-i],1);
                    continue;
                }
                return true;
            }
            if(map.containsKey(nums[m])) return true;
        }
        return false;
    }
} 