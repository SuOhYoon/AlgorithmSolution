import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String [] old = myString.split("");
        String [] newArr = new String[old.length];
        
        for(int i=0;i<old.length;i++){
            if(old[i].equals("A")){
                newArr[i] = "B";
            } else if(old[i].equals("B")){
                newArr[i] = "A";
            }
        }
        
        myString = String.join("", newArr);
        
        System.out.println(myString);
        
        if(myString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}