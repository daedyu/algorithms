package TEST;

/*
ATM 인출 시간 계산
    > 인하은앵 ATM 이 1대 뿐 이 ATM 앞에 N명의 사람이 줄 서 있다.
    > i번 사람이 돈을 인출하는데 걸리는 시간은 p분
    > 사람들이 줄을 서는 순서에 따라서 돈을 인출하는데 필요한 시간의 합 구하기
    stdin
        > 첫번째 줄에 사람의 수 1 <= N <= 1000
        > 두번째 줄에 각 사람이 돈을 인출하는데 걸리는 시간이 주어진다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TEST018
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N =  scan.nextInt();

        int[] A = new int[N];

        for (int i = 0 ; i < N; i++)
        {
            A[i] = scan.nextInt();
        }

        Arrays.sort(A);

        int sol = 0;
        int cmp = 0;

        for (int i = 0; i < N; i++)
        {
            cmp += A[i];
            sol += cmp;
        }

        System.out.println(sol);
    }
}
