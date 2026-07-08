class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> lis=new ArrayList<>();
        int rows=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int bot=rows-1;
        int left=0;
        int right=col-1;
        
        while(left<=right && top<=bot){// total no of loops
            for(int i=left;i<=right;i++){
                lis.add(matrix[top][i]);
                
            }
            top+=1;
            for(int i=top;i<=bot;i++){
                lis.add(matrix[i][right]);
                

            }
            right-=1;
            if (top <= bot) {
            for(int i=right;i>=left;i--){
                lis.add(matrix[bot][i]);
                
            }
            bot-=1;
            }
            if (left <= right) {
            for(int i=bot;i>=top;i--){
                 lis.add(matrix[i][left]);
                 
            }
            left+=1;
            }
        }
        return lis;
    }
}
