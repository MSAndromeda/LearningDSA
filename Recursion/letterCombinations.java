// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// 17. Letter Combinations of a Phone Number

class Solution {
    public List<String> letterCombinations(String digits) {
        return Recursion("", digits);
    }
    private ArrayList<String> Recursion(String p, String up){
        if(up.isEmpty()){
            if(p.isEmpty()) return new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '1';
        ArrayList<String> list = new ArrayList<>();

        int first = (digit >= 7)? (digit-1)*3+1 : (digit-1)*3;
        int last = (digit >= 6)? (digit)*3+1 : (digit)*3;
        last = (digit == 8)? last+1 : last;

        for(int i = first; i < last; i++){
            char ch = (char)('a' + i);
            list.addAll(Recursion(p+ch,up.substring(1)));
        }
        
        return list;
    }
}