import java.util.*;
import java.io.*;

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Coordinate> coordinates = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            coordinates.add(new Coordinate(x, y));
        }

        // x좌표가 증가하는 순서대로 정렬하되, x좌표가 같으면 y좌표가 증가하는 순서대로 정렬
        coordinates.sort(Comparator.comparingInt((Coordinate c) -> c.x)
                           .thenComparingInt(c -> c.y));

        for (Coordinate c : coordinates) {
            System.out.println(c.x + " " + c.y);
        }
    }
}
