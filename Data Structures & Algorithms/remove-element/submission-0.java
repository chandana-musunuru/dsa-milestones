class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        List<Integer> lis=new ArrayList<>();
        for(int num:nums){
            if(num!=val){
    
                lis.add(num);
            }
        }
        Arrays.fill(nums,0);
        int i=0;
        for(int num:lis){
            nums[i++]=num;
        }
        return lis.size();
    }
}