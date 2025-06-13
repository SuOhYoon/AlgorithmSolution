import java.io.*;
import java.util.*;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cut = (int) Math.round(N * 0.15);  // 절사할 개수

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);  // 정렬

        // 절사 평균 구하기
        int sum = 0;
        for (int i = cut; i < N - cut; i++) {
            sum += arr[i];
        }

        int count = N - cut * 2;
        int result = (int) Math.round(sum / (double) count);
        System.out.println(result);
    }
}
