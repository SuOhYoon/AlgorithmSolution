import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        br.close();

        // 초기 큐 값 설정: 1 2 3 4...N
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        // 큐의 크기가 1보다 클 때까지 반복
        while (queue.size() > 1) {
            // 1. 하나 제거
            int removed = queue.remove();

            // 2. 맨 앞의 요소를 꺼내서 맨 뒤로 보냄
            int rotate = queue.remove();
            queue.add(rotate);
        }

        bw.write(queue.peek() + "\n");
        bw.flush();  // 출력 버퍼 비우기
        bw.close();  // 자원 정리
    }
}