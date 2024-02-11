// https://leetcode.com/problems/product-of-array-except-self/

// 238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int curr = 1;
        for(int i = 0; i < n; i++){
            ans[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n-1; i >= 0; i--){
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}