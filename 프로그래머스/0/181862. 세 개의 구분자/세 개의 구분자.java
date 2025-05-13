import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] splitArr = myStr.split("[abc]");
        
        List<String> resultList = new ArrayList<>();
        for (String s : splitArr) {
            if (!s.isEmpty()) {
                resultList.add(s);
            }
        }

        if (resultList.isEmpty()) {
            return new String[] {"EMPTY"};
        }

        return resultList.toArray(new String[0]);
    }
}
