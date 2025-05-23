import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
    }
}