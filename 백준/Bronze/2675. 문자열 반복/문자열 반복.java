import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0;i<t;i++){
            String answer = "";
            int r = sc.nextInt();
            String s = sc.next();
            String [] arr = s.split("");

            for (String string : arr) {
                answer += string.repeat(r);
            }
            System.out.println(answer);
        }
    }
}