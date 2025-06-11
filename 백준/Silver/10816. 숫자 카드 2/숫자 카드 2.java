import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Map<Integer, Integer> myCardMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            myCardMap.put(num, myCardMap.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(input2[i]);
            bw.write(myCardMap.getOrDefault(target, 0) + (i != M - 1 ? " " : ""));
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }
}
