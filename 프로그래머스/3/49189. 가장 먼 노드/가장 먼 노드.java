import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];

        // 노드 번호가 1부터 시작하므로 n+1개 준비
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        // 간선 추가 (양방향 그래프)
        for (int[] node : edge) {
            list.get(node[0]).add(node[1]);
            list.get(node[1]).add(node[0]);
        }

        // (정렬은 선택사항, BFS엔 영향 없음)
        for (List<Integer> neighbors : list) {
            neighbors.sort(Comparator.naturalOrder());
        }

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);         // 시작 노드 1
        visited[1] = true;

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            for (int next : list.get(temp)) {
                if (!visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[temp] + 1;
                    myQueue.add(next);
                }
            }
        }

        int max = Arrays.stream(distance).max().getAsInt();
        int answer = 0;
        for (int d : distance) {
            if (d == max) answer++;
        }

        return answer;
    }
}
