import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int Y = 0;

        for(int i=0;i<T;i++){
            int H = sc.nextInt(); // 호텔 층수
            int W = sc.nextInt(); // 층에 있는 호텔 방 개수
            int N = sc.nextInt(); // 배정받는 손님 순서

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));

            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}