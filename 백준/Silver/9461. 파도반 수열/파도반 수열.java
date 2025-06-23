import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        // dp 배열은 최대 필요한 크기만큼 미리 선언
        // 문제 조건에 따라 최대 n을 알 수 있으면 해당 크기로 지정
        // 예: n 최대값을 100으로 가정
        Long[] dp = new Long[101];
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 2] + dp[i - 3];
            }
            sb.append(dp[n]).append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}