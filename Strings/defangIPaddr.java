// https://leetcode.com/problems/defanging-an-ip-address/

// 1108. Defanging an IP Address

class Solution {
    public String defangIPaddr(String address) {
       return address.replace(".", "[.]");
    }
}