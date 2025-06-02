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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Coordinate> coordinates = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            coordinates.add(new Coordinate(x, y));
        }
        br.close();

        // y좌표 기준 오름차순 정렬, y좌표가 같다면 x좌표 기준으로 오름차순 정렬
        coordinates.sort(Comparator.comparingInt((Coordinate c) -> c.y)
                .thenComparingInt(c -> c.x));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            Coordinate c = coordinates.get(i); // coordinates를 순회하면서 얻은 값을 coordinate 객체에 담음
            sb.append(c.x).append(" ").append(c.y).append("\n");
        }

        bw.write(sb.toString()); 
        bw.flush();
        bw.close();   
    }
}
