class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean divisible = true;
            int d = i;
            while(d>0){
                
                if(d%10 == 0 || i%(d%10)!=0){
                    divisible = false;
                    break;
                }
                d = d/10;
            }
            
            if(divisible){
                result.add(i);
            }
        }
        return result;
    }
}
//https://leetcode.com/problems/self-dividing-numbers/