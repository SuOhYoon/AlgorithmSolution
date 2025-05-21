import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        String d1 = String.format("%04d%02d%02d", date1[0], date1[1], date1[2]);
        String d2 = String.format("%04d%02d%02d", date2[0], date2[1], date2[2]);

        return d1.compareTo(d2) < 0 ? 1 : 0;
    }
}