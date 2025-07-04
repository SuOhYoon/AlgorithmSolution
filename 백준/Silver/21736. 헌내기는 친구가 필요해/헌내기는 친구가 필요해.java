import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    static int friendCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]); // 행
        m = Integer.parseInt(input[1]); // 열

        map = new char[n][m];
        visited = new boolean[n][m];

        int startX = -1, startY = -1;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }

        dfs(startX, startY);

        if (friendCount == 0) {
            System.out.println("TT");
        } else {
            System.out.println(friendCount);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        if (map[x][y] == 'P') {
            friendCount++;
        }

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && map[nx][ny] != 'X') {
                    dfs(nx, ny);
                }
            }
        }
    }
}