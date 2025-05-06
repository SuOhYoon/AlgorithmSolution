class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        pat = pat.toLowerCase();
        myString = myString.toLowerCase();
        
        if(myString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}