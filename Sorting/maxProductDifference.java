// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

// 1913. Maximum Product Difference Between Two Pairs

// Sorting Solution
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int b = nums[nums.length-2];
        int c = nums[0];
        int d = nums[1];
        return (a*b)-(c*d);
    }
}

// A more optimized Algorithm involving logic instead of Sorting 
class Solution {
    public int maxProductDifference(int[] nums) {
        int[] a = maxMinPair(nums);
        int[] b = maxMinPair(nums);
        return a[0] * b[0] - a[1] * b[1];
    }
    public int[] maxMinPair(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxindex = 0;
        int minindex = 0;
        for(int i = 0; i < nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
                maxindex = i;
            }
            if(min>nums[i] && nums[i] != Integer.MIN_VALUE){
                min = nums[i];
                minindex = i;
            }
        }
        nums[maxindex] = Integer.MIN_VALUE;
        nums[minindex] = Integer.MIN_VALUE;
        return new int[] {max, min};
    }
}