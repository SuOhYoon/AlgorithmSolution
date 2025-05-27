import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        int V = Integer.parseInt(line[2]);
        
        br.close();

        int N = 0;

        N = (V - A) / (A - B);
        if ((V - A) % (A - B) != 0) {
            N++;
        }
        System.out.println(N + 1);
    }
}