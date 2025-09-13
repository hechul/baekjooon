import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        ArrayList<Integer> XX = new ArrayList<>();
        // 배열로 막대들의 집합을 만들고 하나씩 배열에 넣어준다
        XX.add(64);
        if(X == 64){
            System.out.println(XX.size());
            return;
        }
        int sum = 65;
        while (sum != X) {// 배열의 합이 X와 같을때 까지 반복
            sum = 0;
            // sum 처음은 65지만 배열안의 합과 같다.
            // 배열안에서 가장 작은 값을 절반으로 자른다
            // 배열에서 가장 작은 값을 구해오기
            int min = Collections.min(XX);
            // 가장 작은 값의 절반 구해오기
            int half = min/2;
            // 가장 작은 값의 절반을 구했으니 가장 작은 값 삭제
            XX.remove(Integer.valueOf(min));
            // 절반은 배제하고 나머지 절반을 배열에 넣기
            XX.add(half);
            // 배열안의 합을 구하기 위한 for문
            for (int num : XX) {
                sum += num;
            }
            if(sum < X){
                XX.add(half);
            }
        }
            System.out.println(XX.size());
    }
}
// 64cm 막대기가 있는데
// Xcm인 막대가 가지고 싶어졌다.
// 원래 가지고 있던 막대를 더 작은 막대로 자름
// 풀로 붙여서 길이가 Xcm인 막대를 만들고싶다.


// 가지고 있는 막대중 가장 길이가 짧은 것을 절반으로 자른다
// 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의
// 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 진짜로 버린다.
// 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는가?