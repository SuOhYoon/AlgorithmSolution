import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장

        int n = Integer.parseInt(br.readLine());
        br.close();

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;

        for(int i=3;i<=n;i++){
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        sb.append(dp[n]).append("\n");
        System.out.println(sb);
    }
}