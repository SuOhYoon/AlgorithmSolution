class Solution {
    public int solution(int a, int b) {
        double res = 0;
        int answer = 0;
        if ((a % 2 != 0)&&(b % 2 != 0)){
            res = Math.pow(a, 2) + Math.pow(b, 2);
        } else if ((a % 2 != 0)||(b % 2 != 0)){
            res = 2 * (a + b);
        } else {
            res = Math.abs(a-b);
        }
        answer = (int)res;
        return answer;
    }
}