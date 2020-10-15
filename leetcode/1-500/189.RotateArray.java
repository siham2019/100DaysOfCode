class Solution {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length){
            k = k%nums.length;
        }
        for(int i=0, idx =0; i<nums.length ; ){
            int z = idx;
            int j = nums[idx];
            do{
                int d = nums[(idx+k)%nums.length];
                nums[(idx+k)%nums.length] = j;
                idx = (idx+k)%nums.length;
                j = d;
                //System.out.println("i="+i+" j="+j+" idx="+idx);
                i++;
            }while(z!=idx);
            z++;
            idx = z;
        }
    }
}
//https://leetcode.com/problems/rotate-array/