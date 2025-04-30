import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] copy1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] copy2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        
        int[] answer = new int[copy1.length + copy2.length];
        System.arraycopy(copy1, 0, answer, 0, copy1.length);
        System.arraycopy(copy2, 0, answer, copy1.length, copy2.length);
        return answer;
    }
}