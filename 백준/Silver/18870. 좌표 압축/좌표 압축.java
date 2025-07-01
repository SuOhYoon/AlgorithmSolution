import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 1. 중복 제거 + 정렬
        Set<Integer> set = new TreeSet<>();
        for (int num : arr) set.add(num);

        // 2. 압축 맵 구성
        Map<Integer, Integer> compressed = new HashMap<>();
        int idx = 0;
        for (int num : set) {
            compressed.put(num, idx++);
        }

        // 3. 원래 배열 기준으로 압축값 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(compressed.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}