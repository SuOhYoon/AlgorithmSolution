import java.io.*;
import java.util.*;

public class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        // 8x8 체스판 시작 위치 (i,j)
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, getRepaintCount(i, j));
            }
        }

        System.out.println(min);
    }

    static int getRepaintCount(int x, int y) {
        int cnt1 = 0; // 'W'로 시작
        int cnt2 = 0; // 'B'로 시작

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // (i + j) % 2 == 0 : 첫 색깔과 같아야 함
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') cnt1++;
                    if (board[i][j] != 'B') cnt2++;
                } else {
                    if (board[i][j] != 'B') cnt1++;
                    if (board[i][j] != 'W') cnt2++;
                }
            }
        }
        return Math.min(cnt1, cnt2);
    }
}
