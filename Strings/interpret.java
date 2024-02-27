// https://leetcode.com/problems/goal-parser-interpretation/

// 1678. Goal Parser Interpretation

class Solution {
    public String interpret(String command) {
        int len = command.length();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(command.charAt(i) == 'G') result.append('G');
            else if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    result.append('o');
                    i++;
                }else{
                    result.append("al");
                    i += 3;
                }
            }
        }
        return result.toString();
    }
}