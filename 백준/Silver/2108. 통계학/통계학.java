import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        sb.append(arithmeticMean(arr, N)).append("\n");
        sb.append(median(arr)).append("\n");
        sb.append(mode(arr)).append("\n");
        sb.append(range(arr)).append("\n");

        System.out.println(sb);
    }

    static int arithmeticMean(int[] arr, int N) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (int) Math.round((double) sum / N);
    }

    static int median(int[] arr) {
        return arr[arr.length / 2];
    }

    static int mode(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(freq.values());

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);
        return modes.size() > 1 ? modes.get(1) : modes.get(0);
    }

    static int range(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }
}
