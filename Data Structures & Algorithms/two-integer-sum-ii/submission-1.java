class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left=0;
        int right=numbers.length-1;
        if(right+1<2) return new int[]{-1,-1};
        while(left<right){
            while(left<right && numbers[left]+numbers[right]>target){
                right--;
            }
            while(left<right && numbers[left]+numbers[right]<target){
                left++;
            }
            if(left<right && numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}
