import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(num_list);
        int max = Integer.MIN_VALUE;

        for (int number : num_list) {
            if (number > max) max = number;
        }
        
        
        for(int i=0;i<5;i++){
            if(num_list[i] < max)
                answer.add(num_list[i]);
        }
        
        return answer;
    }
}