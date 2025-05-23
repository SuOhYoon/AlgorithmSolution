import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 참가자 수
        int n = Integer.parseInt(br.readLine());

        // 사이즈 별 신청자 수
        String[] line2 = br.readLine().split(" ");
        int[] size = new int[line2.length];
        for (int i = 0; i < line2.length; i++) {
            size[i] = Integer.parseInt(line2[i]);
        }

        String[] line3 = br.readLine().split(" ");
        int t = Integer.parseInt(line3[0]); // 티셔츠 묶음 수
        int p = Integer.parseInt(line3[1]); // 펜 묶음 수

        // 티셔츠 묶음 수 계산
        int sum = 0;
        for (int i = 0; i < size.length; i++) {
            sum += (size[i] + t - 1) / t; // 올림 처리
        }

        // 펜 계산
        int penSet = n / p;
        int extraPen = n % p;

        System.out.println(sum);
        System.out.println(penSet + " " + extraPen);
    }
}
