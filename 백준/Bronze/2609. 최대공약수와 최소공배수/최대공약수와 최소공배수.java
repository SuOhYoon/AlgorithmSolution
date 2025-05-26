import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        br.close();

        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);

        int gcd = gcd(A, B); // 최대공약수
        int lcm = lcm(A, B); // 최소공배수

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
