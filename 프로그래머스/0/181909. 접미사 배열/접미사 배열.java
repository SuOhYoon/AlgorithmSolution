import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int length = my_string.length();
        answer = new String[length];
        
        for (int i=0;i<length;i++){
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}