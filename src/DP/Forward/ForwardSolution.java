package DP.Forward;

public class ForwardSolution {

    /** 96. 不同的二叉搜索树
     * medium
     * 从前向后状态叠加。
     * dp[i]=∑dp[j]∗dp[i−j−1],0<=j<=i−1
     * i-j-1是因为要刨除当前根节点
     * */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
}
