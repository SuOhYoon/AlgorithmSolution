import java.io.*;

public class Main {
    private static final int M = 1234567891;
    private static final int R = 31;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();

        long hash = calculateHash(str, L);
        System.out.println(hash);
    }

    public static long calculateHash(String str, int length) { // 해쉬값 만들기
        long sum = 0;
        long power = 1;

        for (int i = 0; i < length; i++) {
            int a = str.charAt(i) - 'a' + 1; // a위치부터 시작
            sum = (sum + a * power) % M; //
            power = (power * R) % M;
        }

        return sum;
    }
}
