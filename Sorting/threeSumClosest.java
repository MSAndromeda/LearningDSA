// https://leetcode.com/problems/3sum-closest/

// 16. 3Sum Closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int ans = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum==target) return target;
                if(sum<target) j++;
                else k--;
                
                int temp = Math.abs(target-sum);
                if(temp < min){
                    ans = sum;
                    min = temp;
                }
            }
        }
        return ans;
    }
}