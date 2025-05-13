import java.util.*;

class Solution {
    public List<String> solution(String myString) {
        List<String> answer = new ArrayList<>();
        
        String[] arr = myString.split("x", 0);
        Arrays.sort(arr);
        
        for(String str : arr)
            if(!str.equals(""))
                answer.add(str);
                
    
        return answer;
    }
}