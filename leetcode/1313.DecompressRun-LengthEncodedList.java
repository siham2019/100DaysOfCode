class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i< nums.length ; i+=2){
            len+=nums[i];
        }
        int[] a = new int[len];
        int k=0;
        for(int i = 0; i< nums.length ; i+=2){
            for(int j=0;j<nums[i];j++,k++){
                a[k] = nums[i+1];
            }
        }
        return a;
    }
}
//https://leetcode.com/problems/decompress-run-length-encoded-list/