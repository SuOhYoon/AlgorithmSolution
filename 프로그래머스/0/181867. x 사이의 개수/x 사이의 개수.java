import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        String [] arr = myString.split("x", -1);
        
        for(int i=0;i<arr.length;i++){
            answer.add(arr[i].length());
        }
        
        return answer;
    }
}