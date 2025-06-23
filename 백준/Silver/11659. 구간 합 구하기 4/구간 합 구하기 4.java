import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N + 1];  // 1-based index
        int[] prefixSum = new int[N + 1];

        String[] numbers = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(numbers[i - 1]);
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int m = 0; m < M; m++) {
            String[] range = br.readLine().split(" ");
            int i = Integer.parseInt(range[0]);
            int j = Integer.parseInt(range[1]);

            sb.append(prefixSum[j] - prefixSum[i - 1]).append("\n");
        }

        System.out.println(sb);
    }
}