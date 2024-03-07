// https://leetcode.com/problems/intersection-of-two-arrays-ii/

// 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int n = nums1.length, m = nums2.length;
        mergesort(nums1, 0, nums1.length);
        mergesort(nums2, 0, nums2.length);
        int i = 0, j = 0;
        while(i < n && j < m){
            int a = nums1[i], b= nums2[j];
            if(a == b){
                intersection.add(a);
                i++;
                j++;
            }else if(a < b){
                i++;
            }else{
                j++;
            }
        }

        int[] result = new int[intersection.size()];
        int k = 0;
        for (Integer num: intersection) {
            result[k++] = num;
        }
        return result;
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