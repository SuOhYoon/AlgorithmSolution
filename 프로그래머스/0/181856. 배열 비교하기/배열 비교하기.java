class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for(int num : arr1)
            a += num;
        
        for(int num : arr2)
            b += num;
        
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                answer = 1;
            } else {
                answer = -1;
            }
        } else {
            if(a == b){
                return 0;
            } else {
                answer = (a > b) ? 1 : -1;
            }
        }
        
        return answer;
    }
}