import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i++){
            if(i >= n){
                answer.add(num_list[i]);
            } else {
                list1.add(num_list[i]);
            }
        }
        answer.addAll(list1);
        
        return answer;
    }
}