class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'A'){
                arr[i] = 'A';
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }
}