class Solution {
    public int[] plusOne(int[] digits) {
        int ilen=digits.length-1;
        int carry=1;
        while(carry==1 && ilen>=0){
            digits[ilen]=digits[ilen]+carry;
            carry=digits[ilen]/10;
            digits[ilen]=digits[ilen]%10;
            ilen--;
        }
        if(carry==1){
            int[] res=new int[digits.length+1];
            res[0]=1;
            System.arraycopy(digits,0,res,1,digits.length);
            return res;
        }
        return digits;
    }
}
