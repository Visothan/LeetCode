class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int m=nums.length;
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }
        int Target=(sum + target) / 2;
        int[][] dp=new int[m+1][Target+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=Target;j++){
                if(i==0&&j==0){
                    dp[i][j]=1;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else if(nums[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }
            }
        }
        int s1=(sum+target)/2;
        int s2=s1-target;
        return dp[m][s1];
    }
}