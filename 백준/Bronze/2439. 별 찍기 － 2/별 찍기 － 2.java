import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            String t = " ";
            String star = "*";
            System.out.println(t.repeat(n-i) + star.repeat(i));
        }
    }
}