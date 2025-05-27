import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int result = recursive(K, N);

            System.out.println(result);
        }
        br.close();
    }

    public static int recursive(int K, int N){
        if(N == 0){
            return 0;
        } else if((K == 0) ){
            return N;
        } else {
            return recursive(K-1, N) + recursive(K, N-1);
        }
    }
}
