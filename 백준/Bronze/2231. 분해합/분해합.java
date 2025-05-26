import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        int result = 0;

        for(int i = 0; i < N; i++){ // 1부터 N까지 반복
            int num = i;
            int sum = i;

            while(num != 0){ // 0이 되기 전까지 반복
                sum += num%10; // 각 자리수의 합
                num/=10; // 자리수 이동
            }

            if(sum == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
} 