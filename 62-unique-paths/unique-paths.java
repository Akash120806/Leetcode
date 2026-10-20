class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return path( m -1, n-1, dp);
    }
    public int path(int i , int j , int[][]dp){
        if(i==0 && j==0){
            return dp[0][0]=1;
        }
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int up=path(i-1,j,dp);
        int left=path(i,j-1,dp);
        return dp[i][j]=up + left;

    }
}