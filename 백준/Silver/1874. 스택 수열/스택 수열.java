import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int current = 1;


        for(int i=0;i<n;i++){
            int target = Integer.parseInt(br.readLine());

            // 현재 숫자가 목표 숫자와 같아질때까지 계속 push
            while(current <= target){
                stack.push(current++);
                sb.append("+\n");
            }

            // 스택의 최상단 값이 목표 숫자라면
            if(stack.peek() == target){
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}