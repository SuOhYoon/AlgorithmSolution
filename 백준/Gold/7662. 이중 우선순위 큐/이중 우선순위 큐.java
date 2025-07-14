import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static TreeMap<Integer, Integer> map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

        while (T-- > 0) { // 테스트 케이스 수 만큼 반복
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
                System.out.println("EMPTY");
            } else {
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }
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
