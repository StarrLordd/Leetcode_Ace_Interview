class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] atl = new boolean[rows][cols];
        boolean[][] pac = new boolean[rows][cols];
        for(int j = 0; j < rows; j++){
            for(int k = 0; k < cols; k++){
                atl[j][k] = false;
                pac[j][k] = false;
            }
        }
        for(int i = 0; i < cols; i++){
            dfs(0, i, pac, heights[0][i], rows, cols, heights);
            dfs(rows-1, i, atl, heights[rows-1][i], rows, cols, heights);
        }
        for(int i = 0; i < rows; i++){
            dfs(i, 0, pac, heights[i][0], rows, cols, heights);
            dfs(i, cols-1, atl, heights[i][cols-1], rows, cols, heights);
        }
        for(int j = 0; j < rows; j++){
            for(int k = 0; k < cols; k++){
                if(atl[j][k] == true && pac[j][k] == true){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(j);
                    temp.add(k);
                    result.add(temp);
                }
            }
        }
        return result;
    }
    
    public void dfs(int row, int col, boolean[][] visited, int prevHeight, int rows, int cols, int[][] heights){
        if(row < 0 || col < 0 || row == rows || col == cols){
            return;
        }
        if(visited[row][col] == true || (heights[row][col] < prevHeight)){
            return;
        }
        visited[row][col] = true;
        dfs(row + 1, col, visited, heights[row][col], rows, cols, heights);
        dfs(row - 1, col, visited, heights[row][col], rows, cols, heights);
        dfs(row, col + 1, visited, heights[row][col], rows, cols, heights);
        dfs(row, col - 1, visited, heights[row][col], rows, cols, heights);
    }
}