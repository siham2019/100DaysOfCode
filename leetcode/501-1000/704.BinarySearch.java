class Solution {
    public int search(int[] nums, int target) {
        return binSearch(nums, 0, nums.length-1, target);
    }
    private int binSearch(int[] nums, int i, int j, int target){
        if(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target){
                return binSearch(nums,i, mid-1, target);
            }
            else {
                return binSearch(nums,mid+1, j, target);
            }
        }
        return -1;
    }
}
//https://leetcode.com/problems/binary-search/