class Solution {

    public boolean solve(char[][] board,int i,int j,String s,int index){
        if(index==s.length()){
            return true;
        }
        if(i>=board.length || i<0 || j>=board[0].length || j<0 || board[i][j]!=s.charAt(index)){
            return false;
        }
        board[i][j]='*';
        boolean ans=solve(board,i+1,j,s,index+1) || solve(board,i-1,j,s,index+1) || solve(board,i,j+1,s,index+1) || solve(board,i,j-1,s,index+1);
        board[i][j]=s.charAt(index);
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(solve(board,i,j,word,0)==true){
                    return true;
                }
            }
        }
        return false;
    }
}