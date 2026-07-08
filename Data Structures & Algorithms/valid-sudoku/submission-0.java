class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Integer>> rowSet=new HashMap<>();
        Map<Integer,Set<Integer>> colSet=new HashMap<>();
        Map<Integer, Set<Integer>> boxSet = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rowSet.put(i, new HashSet<>());
            colSet.put(i, new HashSet<>());
            boxSet.put(i, new HashSet<>());
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int val=board[i][j]-'0';
                if(board[i][j]=='.') continue;
                if(!rowSet.get(i).add(val)) return false;
                if(!colSet.get(j).add(val)) return false;
                //3*3 matrix
                int boxIndex=(int)(i/3)*3+(j/3);

                 if(!boxSet.get(boxIndex).add(val)) return false;
            }
        }
        return true;
    }
}
