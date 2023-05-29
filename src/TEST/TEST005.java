package TEST;

/*
나머지 합 구하기
    > N 개의 수 A1, A2, ... An 이 있을때 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수 구하기
    >

stdin : 1번째 줄에 N과 M을 입력한다
        2번째 줄에 N 개의 수 A 가 주어진다
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEST005
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];

        int[] sumArr = new int[N];

        int result = 0;

        for (int i = 0; i < N; i++)
        {
            arr[i] = scan.nextInt();
            for (int j = 0; j < i; j++)
            {
                sumArr[i] += arr[j];
            }

            if (sumArr[i] % M == 0)
            {
                result++;
            }
        }

        System.out.println(result);

    }
}
