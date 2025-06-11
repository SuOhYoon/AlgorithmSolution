import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = -1; // 마지막으로 추가된 값 추적

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    int x = Integer.parseInt(input[1]);
                    queue.add(x);
                    last = x;
                    break;
                case "pop":
                    Integer pop = queue.poll();
                    bw.write((pop == null ? -1 : pop) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    Integer front = queue.peek();
                    bw.write((front == null ? -1 : front) + "\n");
                    break;
                case "back":
                    bw.write((queue.isEmpty() ? -1 : last) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}