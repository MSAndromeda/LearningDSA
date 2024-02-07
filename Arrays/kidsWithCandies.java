// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

// 1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0, candylen = candies.length;
        List <Boolean> greatCandy = new ArrayList<>(candylen);

        for(int i = 0; i < candylen; i++){
            if(max < candies[i]) max = candies[i];
        }
        for(int i = 0; i < candylen; i++){
            greatCandy.add((candies[i]+extraCandies)>=max);
        }
        return greatCandy;
    }
}