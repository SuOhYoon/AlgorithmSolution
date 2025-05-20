import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> deleteSet = new HashSet<>();
        
        for (int del : delete_list) {
            deleteSet.add(del);
        }

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                answer.add(num);
            }
        }

        return answer;
    }
}
