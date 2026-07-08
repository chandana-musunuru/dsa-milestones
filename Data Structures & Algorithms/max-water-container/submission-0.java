class Solution {
    public int maxArea(int[] heights) {
        int maxVolume=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int innerVolume;
            if(heights[left]<=heights[right]){
                innerVolume=heights[left]*(right-left);
                left++;
            }
            else{
                innerVolume=heights[right]*(right-left);
                right--;
            }
            maxVolume=Math.max(maxVolume,innerVolume);
        }
        return maxVolume;
        
    }
}
