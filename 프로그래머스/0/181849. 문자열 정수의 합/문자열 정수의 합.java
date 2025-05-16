class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] arr = num_str.split("");
        int[] intArray = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            intArray[i] = Integer.parseInt(arr[i]);
        }
        
        for(int i=0;i<intArray.length;i++){
            answer += intArray[i];
        }
        
        return answer;
    }
}