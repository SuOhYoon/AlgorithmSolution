import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int num : num_list)
            list1.add(num);
        
        for(int i=0;i<list1.size();i++){
            if(i>=n-1){
                answer.add(list1.get(i));
            }
        }
        
        
        return answer;
    }
}