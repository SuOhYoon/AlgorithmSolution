import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        // 입력받은 값을 바로 set에 집어넣음
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // Set을 ArrayList로 변환
        List<String> list = new ArrayList<>(set);


        Collections.sort(list, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
