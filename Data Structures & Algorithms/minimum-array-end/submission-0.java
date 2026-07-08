class Solution {
    public long minEnd(int n, int x) {
        //i=1 to n-1 nums[i]<nums[i+1] and 
        // nums[i]&nums[i+1]==x
        //min possible value of nums[n-1]
        //nums[i]==n & nums[i-1]==x
        // so start with nums[i]&x==x
        //3&2 (011)&(010) =010
        long res = x;
        for (int i = 0; i < n - 1; i++) {
            res = (res + 1) | x;
        }
        return res;
        
    }
}