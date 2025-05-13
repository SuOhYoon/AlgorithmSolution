class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int num : arr)
            len += num;
        
        int[] answer = new int[len];
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                answer[count++] = arr[i];
            }
        }
        return answer;
    }
}