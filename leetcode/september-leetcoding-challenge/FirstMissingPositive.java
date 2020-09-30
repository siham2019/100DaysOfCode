class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0; i < nums.length ; i++){
            if(nums[i]!=i+1 && nums[i]<= nums.length && nums[i]>0){
                replace(nums, i, nums[i]-1);
            }
        }
        int m = 1;
        for(int i=0; i < nums.length ; i++){
            if(nums[i] == m){
                m++;
            }
        }
        return m;
    }
    public void replace(int[] nums,int i, int v){
        nums[i] = -1;
        if(nums[v] > 0 && nums[v] <= nums.length){
            replace(nums, v, nums[v]-1);
        }
        nums[v] = v+1;
    }
}

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/558/week-5-september-29th-september-30th/3478/