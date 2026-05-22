class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int cols=grid[0].length;
        int island=0;

        for(int r=0;r<row;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1'){
                    island++;
                    dfs(r,c,grid);
                }
            }
        }
        return island;
    }

    public void dfs(int r,int c,char[][] grid){
        int row=grid.length;
        int cols=grid[0].length;
        //mark visited
        if(r<0 || c<0 
        || r>=row || c>=cols ||  grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
    }
}
