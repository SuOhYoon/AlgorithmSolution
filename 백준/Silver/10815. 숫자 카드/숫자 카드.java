import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set1 = new HashSet<>();

        String[] nCards = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            set1.add(Integer.parseInt(nCards[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] mCards = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            if (set1.contains(Integer.parseInt(mCards[i]))) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
