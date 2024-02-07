// https://leetcode.com/problems/number-of-good-pairs/

// 1512. Number of Good Pairs

class Solution {
    // Time Comp : O(N^2) Aux Space: O(1)
    public int numIdenticalPairs1(int[] nums) {
        int lennums = nums.length, c = 0;
        for(int i = 0; i < lennums; i++){
            for(int j = i+1; j < lennums; j++){
                if(nums[i]==nums[j])c++;
            }
        }
        return c;
    }

    // Time Comp : O(N) Aux Space: O(N)
    public int numIdenticalPairs2(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        int c = 0;
        for(int i : freq){
            c += (i*(i-1))/2;
        }
        return c;
    }
    
    // Time Comp : O(N) Aux Space: O(N)
    public int numIdenticalPairs3(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
}