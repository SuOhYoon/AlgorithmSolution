import java.io.*;
import java.util.*;

public class Main {
    static int num, connections;
    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        num = Integer.parseInt(input[0]);
        connections = Integer.parseInt(input[1]);
        visited = new boolean[num + 1];
        graph = new ArrayList[num + 1];

        for (int i = 1; i <= num; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < connections; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    private static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                visited[node] = true;
                for (int next : graph[node]) {
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
    }
}