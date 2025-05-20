import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if((H == 0) && (M< 45)){ // 0시 이고 45분보다 이르면
            H = 23;
            M +=15;
        } else {
            if(M < 45){ // 45분보다 이르면
                H-=1;
                M+=15;
            } else {
                M -= 45;
            }
        }
        System.out.printf("%d %d", H, M);
    }
}