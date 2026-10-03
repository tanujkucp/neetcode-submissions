class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Rows
        for(int i=0; i<9; i++){
            Set<Character> row = new HashSet<>();
            for(int j=0; j<9; j++){
                Character c = board[i][j];
                if(c == '.') continue;
                if(row.contains(c)){
                    return false;
                } else {
                    row.add(c);
                }
            }
        }

        // Columns
        for(int i=0; i<9; i++){
            Set<Character> col = new HashSet<>();
            for(int j=0; j<9; j++){
                Character c = board[j][i];
                if(c == '.') continue;
                if(col.contains(c)){
                    return false;
                } else {
                    col.add(c);
                }
            }
        }

        // Sub-boxes
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!isSubBoxValid(board, i, j)) {
                    return false;
                }
            }
        }

        return true;

    }

    private boolean isSubBoxValid(char[][] board, int a, int b){
        Set<Character> sub = new HashSet<>();
        for(int i=a; i<a+3; i++){
            for(int j=b; j<b+3; j++){
                Character c = board[i][j];
                if(c == '.') continue;
                if(sub.contains(c)){
                    return false;
                } else {
                    sub.add(c);
                }
            }
        }

        return true;
    }
}

