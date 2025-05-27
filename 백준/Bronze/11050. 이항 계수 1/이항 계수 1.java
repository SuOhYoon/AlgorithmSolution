import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        br.close();

        int result = fact(N) / (fact(K) * fact(N - K));
        System.out.println(result);
    }

    public static int fact(int N) {
        if (N <= 1) {
            return 1;
        } else {
            return N * fact(N - 1);
        }
    }
}
