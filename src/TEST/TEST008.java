package TEST;

/*
좋은수
    > 주어진 N 개의 다른 두 수의 합으로 표현되는 수가 있다면 그 수를 '좋은 수' 라고 한다.
    > N 개의 수중 좋은수의 개수

stdin : 첫번째 줄에 수의 개수 (N)
        두번째 줄에 N 개의 수의 값이 주어진다 (A)
 */

import java.util.Scanner;

public class TEST008
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int [] A = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < N; i++)
        {
            int num = A[i];
            int Try = 0;
            for (int j = 0; j < N; j++)
            {
                if (Try == 1) break;
                for (int l = N - 1; l > j; l--)
                {
                    if (A[j] + A[l] == num)
                    {
                        cnt++;
                        Try += 1;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
