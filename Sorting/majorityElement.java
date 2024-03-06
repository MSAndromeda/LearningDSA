// https://leetcode.com/problems/majority-element/

// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
      int majele = nums[0], count = 1, len = nums.length;
      for(int i = 1; i < len; i++){
          if(majele != nums[i]){
              count--;
              if(count == 0) {
                  majele = nums[i];
                  count++;
              }
          }
          else{
              count++;
          }
      }
      return majele;
    }
}