import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine().trim());
        Map<Integer, Boolean> map = new HashMap<>();

        String line = br.readLine();
        if (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            for (int i = 0; i < N && st.hasMoreTokens(); i++) {
                int num = Integer.parseInt(st.nextToken());
                map.put(num, true);
            }
        }

        int M = Integer.parseInt(br.readLine().trim());
        String queryLine = br.readLine();
        if (queryLine != null) {
            StringTokenizer st = new StringTokenizer(queryLine);
            for (int i = 0; i < M && st.hasMoreTokens(); i++) {
                int query = Integer.parseInt(st.nextToken());
                bw.write(map.containsKey(query) ? "1\n" : "0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
