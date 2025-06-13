import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int M = Integer.parseInt(line[0]);
        int N = Integer.parseInt(line[1]);

        for (int i = M; i <= N; i++) {
            if (i < 2) continue;

            int j;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) break;
            }

            if (j > Math.sqrt(i)) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
