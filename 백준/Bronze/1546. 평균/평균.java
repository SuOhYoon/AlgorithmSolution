import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double sum = 0; // double로 변경 (소수점 계산 위해)
        double max = Double.MIN_VALUE;

        String[] line = br.readLine().split(" ");
        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(line[i]);
            if (arr[i] > max) max = arr[i];
        }

        for (int i = 0; i < N; i++) {
            sum += (arr[i] / max) * 100;
        }

        System.out.println(sum / N); // 평균 출력
    }
}
