import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        // 10개의 수를 입력받아, 42로 나눈 나머지를 Set에 저장
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num % 42); // 중복 제거됨
        }
        br.close();

        System.out.println(set.size()); // 서로 다른 나머지 개수 출력
    }
}
