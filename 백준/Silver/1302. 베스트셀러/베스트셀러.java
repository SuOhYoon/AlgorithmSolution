import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 선언 필드 */
        String result = "";
        int max = 0;
        Map<String, Integer> map = new TreeMap<>();

        /* 입력 필드 */
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        /* 최대 빈도값 구하기 */
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        sb.append(result).append("\n");

        /* 출력 */
        System.out.println(sb);
    }
}
