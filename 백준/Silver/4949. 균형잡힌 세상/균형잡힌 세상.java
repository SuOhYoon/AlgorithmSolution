import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (true) {
            line = br.readLine();
            if (line.equals(".")) break;

            if (isBalanced(line)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        // flush & close
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}