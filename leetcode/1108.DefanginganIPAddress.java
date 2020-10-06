class Solution {
    public String defangIPaddr(String address) {
        StringBuilder r = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                r.append("[.]");
            }
            else{
                r.append(String.valueOf(address.charAt(i)));
            }
        }
        return r.toString();
    }
}
//https://leetcode.com/problems/defanging-an-ip-address/