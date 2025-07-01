import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 1. 배열을 Set으로 옮기기
        for (int l : lost) lostSet.add(l);
        for (int r : reserve) reserveSet.add(r);

        // 2. 자가복구 처리 (잃어버렸지만 여벌 있는 놈)
        Set<Integer> selfFix = new HashSet<>(lostSet);
        selfFix.retainAll(reserveSet); // 겹치는 애들

        for (int i : selfFix) {
            lostSet.remove(i);
            reserveSet.remove(i);
        }

        // 3. 여벌 있는 애들로 앞뒤 번호에 빌려주기
        List<Integer> sortedReserve = new ArrayList<>(reserveSet);
        Collections.sort(sortedReserve); // 순회 순서 중요

        for (int r : sortedReserve) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }

        // 4. 남은 애들 빼고 전원 출석 계산
        return n - lostSet.size();
    }
}
