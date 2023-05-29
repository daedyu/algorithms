/*
구간합
    > 구간합은 시간 복잡도를 줄이기 위해 만들어진 기초적인 알고리즘
    > 구간합은 기본 배열 말고 구간 합 배열을 또 생성하여 각 배열마다 값을 대입함
 */

/*
구간 합 구하기
    > 수 N 개가 주어질때 i to j 까지의 합을 구하는 코드를 작성한다.

stdin : 첫번째 줄에는 줄의 수의 개수 (N), 합을 구해야 하는 횟수 (M) 이 주어짐
        2번째 줄에는 배열이 주어짐
        3번째 줄부터는 M개의 줄의 합을 구해야 하는 i, j 가 주어짐
 */

package TEST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEST003
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1번째 줄
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];

        int[] sumArr = new int[N];

        List<Integer> sum = new ArrayList<>();

        // 2번째 줄
        for (int l = 0; l < N; l++)
        {
            arr[l] = scan.nextInt();
            for (int add = 0; add <= l; add++)
            {
                sumArr[l] += arr[add];
            }
        }

        for (int l = 0; l < M; l++)
        {
            int i = scan.nextInt();
            int j = scan.nextInt();

            i -= 2;
            j -= 1;
            int minu = 0;
            if (i < 0) minu = 0;
            else minu = sumArr[i];

            sum.add(sumArr[j] - minu);
        }
        System.out.println(sum);
    }
}
