class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len=temperatures.length;
        int[] result=new int[len];
        Stack<Integer> index=new Stack<>();
        for(int i=len-1;i>=0;i--){
           while(!index.isEmpty() && temperatures[i]>=temperatures[index.peek()]){
            index.pop();
           }
           result[i]=index.isEmpty()?0:index.peek()-i;
           index.push(i);
        }
        return result;
    }
}
