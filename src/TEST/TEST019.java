package TEST;

/*
K 번쨰 수 구하기
    > 수 N개가 주어짐 A를 오름차순 정렬시 앞에서 부터 K 번째에 있는 수를 구하는 프로그램 작성

    stdin
        > 첫번째 줄에 N과 K
        > 두번째 줄에 A 가 주어진다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TEST019
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }

        Arrays.sort(A);

        System.out.println(A[K - 1]);
    }
}
