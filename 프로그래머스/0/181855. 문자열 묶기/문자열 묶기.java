class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31]; // 문자열 길이의 최대값이 30이라고 가정

        for (String str : strArr) {
            int len = str.length();
            count[len]++;
        }

        int max = 0;
        for (int c : count) {
            if (c > max) {
                max = c;
            }
        }

        return max;
    }
}