// https://leetcode.com/problems/count-items-matching-a-rule/

// 1773. Count Items Matching a Rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        int j = ruleval(ruleKey);
        for(List<String> list : items){
            if(list.get(j).equals(ruleValue)) c++;
        }
        return c;
    }
    private int ruleval(String Key){
        return (Key.equals("type"))?0:(Key.equals("color"))?1:2;
    }
}