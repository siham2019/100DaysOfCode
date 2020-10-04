import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0; i<J.length();i++){
            m.put(String.valueOf(J.charAt(i)), 1);
        }
        int r = 0;
        for(int i = 0; i<S.length();i++){
            if(m.get(String.valueOf(S.charAt(i))) != null){
                r++;
            }
        }
        return r;
        
    }
}