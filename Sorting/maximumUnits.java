// https://leetcode.com/problems/maximum-units-on-a-truck/

// 1710. Maximum Units on a Truck

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
       int boxunits = 0;
       for(int[] box: boxTypes){
        if(box[0]<=truckSize){
            boxunits += box[0]*box[1];
            truckSize -= box[0];
        }else{
            boxunits += truckSize*box[1];
            return boxunits;
        }
       }
       return boxunits;
    }
}