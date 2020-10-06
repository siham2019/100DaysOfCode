class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
//https://leetcode.com/problems/defanging-an-ip-address/