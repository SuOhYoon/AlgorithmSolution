import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄 입력: N은 카드 개수, M은 목표 합
        String[] line1 = br.readLine().split(" ");
        int N = Integer.parseInt(line1[0]); // 카드의 개수
        int M = Integer.parseInt(line1[1]); // 목표 숫자

        // 두 번째 줄 입력: 카드에 적힌 숫자들
        String[] line2 = br.readLine().split(" ");
        br.close(); // 더 이상 입력 받을 필요 없으므로 닫기

        int[] cards = new int[N]; // 카드 숫자를 담을 배열

        // 문자열 배열을 정수 배열로 변환
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(line2[i]);
        }

        // 세 카드의 합 중 M에 가장 가까운 값 구하기
        int res = search(cards, N, M);

        // 결과 출력
        System.out.println(res);
    }

    /**
     * 세 장의 카드를 뽑아 만든 합 중, M을 넘지 않으면서 M과 가장 가까운 수를 반환
     * 완전탐색 방식으로 모든 조합 확인
     */
    static int search(int[] arr, int N, int M) {
        int result = 0; // 가장 M에 가까운 합을 저장할 변수

        // 첫 번째 카드 고르기
        for (int i = 0; i < N - 2; i++) {
            // 두 번째 카드 고르기
            for (int j = i + 1; j < N - 1; j++) {
                // 세 번째 카드 고르기
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k]; // 세 카드의 합

                    // 합이 정확히 M과 같으면 바로 반환 (최적의 결과)
                    if (M == temp) {
                        return temp;
                    }

                    // M을 넘지 않으면서 result보다 크면 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        // 최종적으로 가장 M에 가까운 합 반환
        return result;
    }
}
