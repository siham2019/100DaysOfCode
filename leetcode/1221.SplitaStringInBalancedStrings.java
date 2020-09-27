class Solution {
    public int balancedStringSplit(String s) {
        int b =0;
        int l = 0;
        int r = 0;
        for(int j=0 ; j< s.length(); j++){
            if('L' == s.charAt(j)){
                l++;
            }
            else{
                r++;
            }
            if(l == r){
                b++;
                l=0;r=0;
            }
        }
        return b;
    }
}

//https://leetcode.com/problems/split-a-string-in-balanced-strings/