// https://leetcode.com/problems/contains-duplicate/solutions/3672475/4-method-s-c-java-python-beginner-friendly/

// 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        mergesort(nums, 0, nums.length);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
    private void mergesort(int[] arr, int start, int end){
        if(end - start == 1) return;
        int mid = start + (end-start)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end-start];
        int i = start, j = mid, k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]) mix[k++] = arr[i++];
            else mix[k++] = arr[j++];
        }
        while(i < mid) mix[k++] = arr[i++];
        while(j < end) mix[k++] = arr[j++];
        System.arraycopy(mix, 0, arr, start, mix.length);
    }
}