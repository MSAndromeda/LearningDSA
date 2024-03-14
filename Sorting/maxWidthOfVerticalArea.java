// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/

// 1637. Widest Vertical Area Between Two Points Containing No Points

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] nums = new int[points.length];
        int i = 0;
        for(int[] point: points){
            nums[i++] = point[0];
        }
        Arrays.sort(nums);
        int max = 0;
        for(int j = 1; j < i; j++){
            int temp = nums[j]-nums[j-1];
            if(temp>max) max = temp;
        }
        return max;
    }
}