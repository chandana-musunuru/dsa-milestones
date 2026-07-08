class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int min=nums.length;
        int maxLength=1; 
        int max=1;
        if(min==0 || min==1) return min;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
               max+=1;
                
            }
            else if(nums[i-1]+1!=nums[i]){
                
                maxLength=Math.max(max,maxLength);
                max=1;
            }
        }
        maxLength=Math.max(max,maxLength);
        return maxLength;
    }
}
