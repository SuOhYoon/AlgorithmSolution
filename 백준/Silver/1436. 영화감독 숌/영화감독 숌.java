import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        int movie = 666;
        int count = 1;

        while(N > count){
            movie++;
            if(String.valueOf(movie).contains("666")){
                count++;
            }
        }

        bw.write(movie+"");
        bw.flush();
        bw.close();
    }
}