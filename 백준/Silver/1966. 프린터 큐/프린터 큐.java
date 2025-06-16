import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

				// 테스트 케이스만큼 반복
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

						// 문서를 저장할 큐 (priority, index) 형태
            Queue<int[]> queue = new LinkedList<>();
            
            // 중요도만 저장하는 우선순위 큐 (내림차순: 가장 높은 중요도가 우선)
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            
            // N개의 문서 중요도 입력
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.add(new int[]{priority, i}); // 중요도와 해당 문서의 초기 위치를 큐에 저장
                priorityQueue.add(priority); // 중요도를 우선순위 큐에 저장
            }

            int order = 0;
            
            // 큐가 빌 때까지 반복
            while (!queue.isEmpty()) { // 출력 순서를 저장하는 변수
                int[] current = queue.poll(); // 큐의 맨 앞 문서를 꺼냄
                
                // 현재 문서가 출력할 차례인지 확인 (우선순위 큐의 최고 중요도와 비교)
                if (current[0] == priorityQueue.peek()) {
                
		                // 출력할 차례
                    order++;
                    priorityQueue.poll(); // 우선순위 큐에서도 해당 중요도를 제거

                    if (current[1] == M) {
                        sb.append(order).append("\n");
                        break;
                    }
                } else {
		                // 출력할 차례가 아니면 큐의 맨 뒤로 보냄
                    queue.add(current);
                }
            }
        }

        System.out.print(sb);
    }
}