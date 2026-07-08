class Solution {
    public int missingNumber(int[] nums) {
        int high=nums.length;
        int xor=0;
        for(int i=0;i<high;i++){
            xor^=i^nums[i];
        }
        xor^=high;
        return xor;
    }
}
