import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0; // 방문 순서 저장
    static int r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        r = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        br.close();

        int size = (int) Math.pow(2, N);
        divide(0, 0, size);
        sb.append(count).append("\n");
        System.out.println(sb);
    }

    public static void divide(int row, int col, int size) {
        if (size == 1) return;

        int half = size / 2;

        // r, c가 어느 사분면에 있는지 판별
        if (r < row + half && c < col + half) {
            // 1사분면
            divide(row, col, half);
        } else if (r < row + half && c >= col + half) {
            // 2사분면
            count += half * half;
            divide(row, col + half, half);
        } else if (r >= row + half && c < col + half) {
            // 3사분면
            count += 2 * half * half;
            divide(row + half, col, half);
        } else {
            // 4사분면
            count += 3 * half * half;
            divide(row + half, col + half, half);
        }
    }
}
