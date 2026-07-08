class Solution {
    Set<Integer> set=new HashSet<>();
    
    public int helperFunction(int n){
        if(set.contains(n)){
            return 0;
        }
        else if(n!=1) {
            int num=0;
            set.add(n);
            while(n!=0){
                num+=((n%10)*(n%10));
                n/=10;
            }
            return helperFunction(num);
        }
        return 1;
        
    }
    public boolean isHappy(int n) {
        if(n==1) return true;
        return helperFunction(n)==1?true:false;
        
    }
}
