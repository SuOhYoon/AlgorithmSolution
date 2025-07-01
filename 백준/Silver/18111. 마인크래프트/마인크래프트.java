import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 변수 초기화
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int minHeight = 256;
        int maxHeight = 0;

        // 맵 입력 받기 + 최소/최대 높이 탐색
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int height = Integer.parseInt(st.nextToken());
                map[i][j] = height;
                minHeight = Math.min(minHeight, height);
                maxHeight = Math.max(maxHeight, height);
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = 0;

        // 가능한 모든 높이에 대해 시뮬레이션
        for (int h = minHeight; h <= maxHeight; h++) {
            int remove = 0;
            int add = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = map[i][j] - h;

                    if (diff > 0) {
                        remove += diff;
                    } else if (diff < 0) {
                        add -= diff; // diff는 음수
                    }
                }
            }

            // 블럭이 부족하면 해당 높이는 불가능
            if (remove + B >= add) {
                int time = remove * 2 + add;

                // 더 빠르거나, 시간이 같으면 더 높은 높이 선택
                if (time < answerTime || (time == answerTime && h > answerHeight)) {
                    answerTime = time;
                    answerHeight = h;
                }
            }
        }

        System.out.println(answerTime + " " + answerHeight);
    }
}
