import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            int[] dp = new int[10001];

            // 1, 2, 4를 1, 2, 3을 통해 나오는 조합의 개수를 각각 dp[1], dp[2], dp[3]에 설정
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int i=4;i<=N;i++){
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; // 점회식
            }
            sb.append(dp[N]).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
