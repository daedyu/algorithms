package TEST;

/*
오큰수 구하기
    크기가 N인 수열 A = ... 이 있을때, A(i) 에 관한 오큰수를 구한다.
        > 오큰수는 오른쪽에 존재하면서 A 보다 큰수중 가장 왼쪽에 존재하는 수를 의미한다. 이러한 수가 없을때 오큰수는 -1 이다.

stdin : 첫번째 줄에 수열 A의 크기가 주어진다.
        두번째 줄에 수열 A의 원소 들이 주어진다.
 */

import java.util.Scanner;

public class TEST012
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int []A = new int[N];

        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < N;i++)
        {
            int pickedNum = A[i];
            int bigNumArr = -1;

            for (int j = i+1; j < N; j++)
            {
                if (pickedNum < A[j])
                {
                    bigNumArr = j;
                    break;
                }
            }
            if (bigNumArr == -1)
            {
                System.out.print(bigNumArr + " ");
            } else
            {
                System.out.print(A[bigNumArr]+ " ");
            }

        }
    }
}
