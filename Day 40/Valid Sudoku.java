class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> st1=new HashSet<>();
        Set<Character> st2=new HashSet<>();
        Set<Character> st3=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char col=board[i][j];
                char row=board[j][i];
                char c=board[3*(i/3)+j/3][3*(i%3)+j%3];
                if(col!='.' && st1.contains(col)){
                    return false;
                }
                st1.add(col);
                if(row!='.' && st2.contains(row)){
                    return false;
                }
                st2.add(row);
                if(c!='.' && st3.contains(c)){
                    return false;
                }
                st3.add(c);
            }
            st1.clear();
            st2.clear();
            st3.clear();
        }
        return true;
    }
}