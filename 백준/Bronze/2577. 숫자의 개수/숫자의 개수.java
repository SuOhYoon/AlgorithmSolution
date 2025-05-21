import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        br.close();

        int total = a * b * c;


        String str = String.valueOf(total);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';  // '0'을 빼서 정수화
        }

        for(int i=0;i<10;i++){  // 1부터 10까지
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i){ // 만약 arr[i]가 i와 같다면
                    count++; 
                }
            }
            System.out.println(count);
        }
    }
}
