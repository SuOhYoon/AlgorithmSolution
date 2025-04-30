import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4:
                int[] sliced = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                int step = slicer[2];
                answer = new int[(sliced.length + step - 1) / step];
                int idx = 0;

                for (int i = 0; i < sliced.length; i += step) {
                    answer[idx++] = sliced[i];
                }
                break;
        }
        return answer;
    }
}