import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            list.add(sc.nextInt());
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);

            if (current < next) {
                isDescending = false;
            } else if (current > next) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
