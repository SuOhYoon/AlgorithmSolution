class Solution {
    public long solution(int n) {
        int [] dp = new int[2001];
        long answer = 0;
        
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3;i<2001;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        answer = dp[n];
        return answer;
    }
}