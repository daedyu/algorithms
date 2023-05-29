package TEST;

/*
 연속된 자연수의 합 구하기
    > 어떠한 자연수 N 을 연속된 자연수의 합으로 나타냄
    > 15를 나타내는 방법은 7+8 4+5+6 1+2+3+4+5 등이 있다.
 stdin : 1번째 줄에 정수 N이 주어짐
 */

import java.util.Scanner;

public class TEST006
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int cnt = 0;

        int[]arr = new int[N];

        int[] sumArr = new int[N];

        for (int i = 1; i <= N; i++)
        {
            arr[i - 1] = i;
            for (int j = 1; j <= i; j++)
            {
                sumArr[i - 1] += arr[j - 1];
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = i; j < N; j++)
            {
                if (sumArr[j] - sumArr[i] == N)
                {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
