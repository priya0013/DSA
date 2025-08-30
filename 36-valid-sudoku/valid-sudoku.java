class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();
        for(int i = 0; i < 9; i++){
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c == '.') 
                continue;
                if(rows.get(i).contains(c)) 
                    return false;
                rows.get(i).add(c);
                if(cols.get(j).contains(c)) 
                    return false;
                cols.get(j).add(c);
                int boxIndex = (i / 3) * 3 + (j / 3);
                if(boxes.get(boxIndex).contains(c))
                     return false;
                boxes.get(boxIndex).add(c);
            }
        }
        return true;
    }
}