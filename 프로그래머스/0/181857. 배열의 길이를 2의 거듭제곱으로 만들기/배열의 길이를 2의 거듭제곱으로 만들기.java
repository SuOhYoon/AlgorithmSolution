import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            answer.add(num);
        }

        int len = arr.length;
        int powerOfTwo = 1;
        while (powerOfTwo < len) {
            powerOfTwo *= 2;
        }

        int zerosToAdd = powerOfTwo - len;
        for (int i = 0; i < zerosToAdd; i++) {
            answer.add(0);
        }

        return answer;
    }
}