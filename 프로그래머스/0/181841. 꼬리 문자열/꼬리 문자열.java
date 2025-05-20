import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        List<String> list = new ArrayList<>();
        String answer = "";
        for(String s : str_list){
            if(!s.contains(ex)){
                list.add(s);
            }
        }
        answer = String.join("", list);
        
        return answer;
    }
}