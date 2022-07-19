class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int x=1,y=2;
        for(int i=3;i<=n;i++){
            int temp=x+y;
            x=y;
            y=temp;
        }
        return y;
    }
}