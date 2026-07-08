class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int endRow=matrix.length-1;
        int startRow=0;
        int column=matrix[0].length;
        while(startRow<=endRow){
            int mid=startRow+(endRow-startRow)/2;
            if(matrix[mid][0]==target || matrix[mid][column-1]==target){
               return true;
            }
            else if(matrix[mid][0]<=target && matrix[mid][column-1]>=target){
                for(int i=0;i<column;i++){
                    if(matrix[mid][i]==target){
                        return true;
                    }

                }
                return false;
            }
            else if(matrix[mid][0]>target){
                endRow=mid-1;
            }
            else{
                startRow=mid+1;
            }
        }
        return false;
    }
}
