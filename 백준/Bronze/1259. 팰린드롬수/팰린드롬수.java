import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                br.close();
                System.exit(0);
            }
            String str = String.valueOf(num);
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();

            if (str.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}