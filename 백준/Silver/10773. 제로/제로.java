import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<K;i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            } else {
                stack.push(num);
            }
            if(stack.isEmpty()){
                sum = 0;
            }
        }
        br.close();

        for(int n : stack){
            sum += n;
        }

        bw.write(sum + "\n");
        bw.flush();  // 출력 버퍼 비우기
        bw.close();  // 자원 정리
    }
}