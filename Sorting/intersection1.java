// https://leetcode.com/problems/intersection-of-two-arrays/description/

// 349. Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        mergesort(nums1, 0, nums1.length);
        for(int i = 0; i < nums2.length; i++){
            if(binarySearch(nums1,nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        int[] result = new int[intersection.size()];
        int k = 0;
        for (Integer num: intersection) {
            result[k++] = num;
        }
        return result;
    }
    private boolean binarySearch(int[] arr,int target){
        int start = 0, end = arr.length;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid == arr.length) return false;
            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else return true;
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