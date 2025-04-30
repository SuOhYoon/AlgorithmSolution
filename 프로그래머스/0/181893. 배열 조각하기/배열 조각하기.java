import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            int idx = query[i];
            if (i % 2 == 0) {
                while (list.size() > idx + 1) {
                    list.remove(list.size() - 1);
                }
            } else {
                for (int j = 0; j < idx; j++) {
                    list.remove(0);
                }
            }
        }

        // List를 int[] 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
