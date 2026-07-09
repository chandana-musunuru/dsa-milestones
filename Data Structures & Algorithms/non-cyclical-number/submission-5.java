class Solution {
    public int number(int n){
        int tot=0;
        while(n!=0){
            int mul=(n%10)*(n%10);
            tot+=mul;
            n/=10;

        }
        return tot;
    }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        //if set contain num it is not happy
        //if num is 1 it is happy
        if(n==1) return true;
        set.add(n);
        while(n!=1){
            int num=number(n);
            if(num==1){
                return true;
            }
            if(set.contains(num)){
                return false;
            }
            set.add(num);
            n=num;
        }
        return false;
    }
}
