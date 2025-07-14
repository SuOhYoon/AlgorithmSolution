import java.io.*;
import java.util.*;

public class Main {
    static TreeMap<Integer, Integer> map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 💡 BufferedWriter 추가
        StringBuilder sb = new StringBuilder(); // 💡 StringBuilder로 출력 누적

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            map = new TreeMap<>();

            for (int i = 0; i < k; i++) {
                String[] input = br.readLine().split(" ");
                String cmd = input[0];
                int num = Integer.parseInt(input[1]);

                if (cmd.equals("I")) {
                    insert(num);
                } else {
                    delete(num);
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }
        br.close();
        bw.write(sb.toString()); // 한 번에 출력
        bw.flush();
        bw.close();
    }

    static void insert(int n) {
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    static void delete(int flag) {
        if (map.isEmpty()) return;

        int key = (flag == 1) ? map.lastKey() : map.firstKey();

        if (map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, map.get(key) - 1);
        }
    }
}
