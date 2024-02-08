// https://leetcode.com/problems/add-to-array-form-of-integer/

// 989. Add to Array-Form of Integer

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> arrayForm = new ArrayList<>();
        int i = num.length - 1;
        int carry = k;
        while(i>=0||carry>0){
            int sum = carry + ((i>=0)?num[i]:0);
            arrayForm.add(sum%10);
            carry = sum/10;
            i--;
        }
        Collections.reverse(arrayForm);
        return arrayForm;
    }
}