class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        int i = len % 2 !=0 ? 0:1;
        System.arraycopy(arr, 0, answer, 0, len);
        
        while(i<answer.length){
            answer[i] = arr[i] + n;
            i+=2;
        }
        
        return answer;
    }
}