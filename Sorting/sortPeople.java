// https://leetcode.com/problems/sort-the-people/

// 2418. Sort the People

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        quickSort(names,heights,0,heights.length-1);
        return names;
    }
    private void quickSort(String[] names, int[] heights, int lo, int hi){
        if(lo>=hi) return;
        int s = lo;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = heights[mid];
        while(s<=e){
            while(pivot<heights[s]) s++;
            while(pivot>heights[e]) e--;
            if(s<=e){
                int tempheight = heights[s];
                String tempName = names[s];
                heights[s] = heights[e];
                names[s++] = names[e];
                heights[e] = tempheight;
                names[e--] = tempName;
            }
        }
        quickSort(names, heights, lo, e);
        quickSort(names, heights, s, hi);
    }
}