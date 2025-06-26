import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String expression = br.readLine(); // 55 - 50 + 40
        br.close();

        // '-' 기준으로 나눔 -> [55, 50 + 40]
        String[] splitMinus = expression.split("-");

        int result = 0;

        // 첫 그룹은 그냥 더함
        result += sum(splitMinus[0]); // result = 55

        // 나머지 그룹은 모두 괄호로 묶인 것처럼 더한 후 뺌
        for (int i = 1; i < splitMinus.length; i++) {
            result -= sum(splitMinus[i]); // 55 - 90
        }
        
        sb.append(result).append("\n");
        System.out.println(sb);
    }

    private static int sum(String expr) {
        String[] nums = expr.split("\\+"); // + 연산자를 기준으로 문자열 분리
        int total = 0;
        for (String num : nums) {
            total += Integer.parseInt(num);
        }
        return total;
    }
}