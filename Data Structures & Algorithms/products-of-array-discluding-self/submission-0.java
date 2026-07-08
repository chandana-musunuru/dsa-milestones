class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        
        int suffix=1;
        prefix[0]=1;
        for(int i=1;i<n;i++){
           prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int holdValue=nums[i];
            nums[i]=suffix*prefix[i];
            suffix*=holdValue;
        }
        return nums;
    }
}  
