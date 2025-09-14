import java.util.Arrays;
import java.util.Scanner;

public class b1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int hap = 0;
        int[] MB = new int[N];
        // A 배열 채우기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        // B 배열 채우기
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A); // A 배열을 오름차순으로 정렬
        // ex) [1,4,6,32,98]
        Arrays.sort(B);
        // B의 배열에서 가장 작은값 구하기
//        for (int j = 0; j < N; j++) {
//            int min = B[0];
//            for (int i = 1; i < N; i++) {
//                if (min > B[i]) {
//                    min = B[i];
//                }
//            }
//            MB[j] = min; // MB에 [1,2,3,4,5 순으로 저장]
//
//        }

        // A와 B 곱하기
        for (int i = 0; i < N; i++) {
            hap += B[i] * A[N - i - 1];
        }
        System.out.println(hap);

        // 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의한다.
        // S = A[0] x B[0] + ... + A[N-1] x B[N-1]
        // S의 값을 가장 작게 만들기 위해 A의 수를 재 배열하자.
        // B에 있는 수는 재배열하면 안 된다.
        // S의 최솟값을 출력하는 프로그램을 작성.
        // B의 가장 큰수는 A의 가장 작은수와 곱해야 함.
        // B의 가장 작은 수는 A의 가장 큰 수와 곱해야 함.
        // A의 배열에서 가장 큰 값 구하기 ex) 61 12 13 17 08
        // B의 배열에서 가장 작은 값 구하기
        // 다시 A의 배열에서 가장 큰 값 구하기
        // 다시 B의 배열에서 가장 작은 값 구하기
    }
}
