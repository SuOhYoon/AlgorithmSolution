import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command){
                case "push":
                    int x = Integer.parseInt(input[1]);
                    st.push(x);
                    break;
                case "pop":
                    bw.write((st.isEmpty() ? -1 : st.pop()) + "\n");
                    break;
                case "size":
                    bw.write(st.size() + "\n");
                    break;
                case "empty":
                    bw.write((st.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "top":
                    bw.write((st.isEmpty() ? -1 : st.peek()) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}