import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        // queue에 하나씩 집어넣기
        for(int i=1;i<=N;i++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(queue.size() > 1){
            for(int i=0;i<K-1;i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        // 마지막 원소 출력한 뒤 > 도 붙여준다.
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}