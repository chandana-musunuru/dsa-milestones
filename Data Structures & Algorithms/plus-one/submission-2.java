class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length-1;
        int lastDigit=digits[len];
        if(lastDigit<9){
            digits[len]=digits[len]+1;
            return digits;
        }
        while(len>=0 && digits[len]>=9){
            digits[len]=0;
            len=len-1;
        }
        if(len>=0){
            digits[len]+=1;
            return digits;
        }
        int[] ret=new int[digits.length+1];
        ret[0]=1;
        return ret;
       
    }
}
