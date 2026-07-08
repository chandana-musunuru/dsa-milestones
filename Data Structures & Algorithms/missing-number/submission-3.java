class Solution {
    public int missingNumber(int[] nums) {
        int high=nums.length;
        int xor=0;
        for(int i=0;i<high+1;i++){
            xor^=i;
        }
        for(int num:nums){
            xor^=num;
        }
        return xor; 
    }
}
