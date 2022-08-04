class Solution {
    public int[] findBall(int[][] grid) {
        int res[]=new int[grid[0].length];
        int ballsnum=grid[0].length;
        int lastJ=grid[0].length-1, lastI=grid.length-1;
        
        for(int ballnum=0;ballnum<ballsnum;ballnum++){
            int i=0;
            int j=ballnum;
            
            while(i<=lastI){
                int cur=grid[i][j];
                int prev=j==0?1:grid[i][j-1];
                int next=j==lastJ?-1:grid[i][j+1];
                
                boolean isStuck=cur==1 && next==-1 || cur==-1 && prev==1;
                
                if(isStuck) break;
                j+=cur;
                i++;
            }
            res[ballnum]=i<=lastI?-1:j;
        }
        return res;
    }
}
        