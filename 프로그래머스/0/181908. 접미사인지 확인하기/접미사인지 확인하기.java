class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer;
        int length = my_string.length();
        
        if(my_string.endsWith(is_suffix)){
            answer = 1;
        }
        
        else{
            answer = 0;
        }
            
        
        return answer;
    }
}