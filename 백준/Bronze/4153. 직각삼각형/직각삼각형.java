import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine(); // 한 번만 읽어야 함
            if (line == null) break; // EOF
            String[] input = line.split(" ");

            // 숫자 3개 파싱
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a == 0 && b == 0 && c == 0) break; // 추가 종료 조건

            if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                System.out.println("right");
            } else if(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)){
                System.out.println("right");
            } else if(Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}