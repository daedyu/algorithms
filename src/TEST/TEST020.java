package TEST;

/*
수 정렬하기
    > N개의 수가 주어졌을떄 이를 오름파순 정렬하는 프로그램 작성

    stdin
        > 첫번째 줄에 수의 개수 N
        > 두번째 N개의 줄에 숫자가 주어짐 오름차순으로 정렬
            |수는 중복되지 않는다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TEST020
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }

        Arrays.sort(A);

        for (int i = 0; i < N; i++)
        {
            System.out.println(A[i]);
        }
    }
}
