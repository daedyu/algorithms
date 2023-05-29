package TEST;

/*
주몽의 명령
    > 갑옷의 재료 : 2개의 재료의 번호를 더해 M 이 되면 갑옷이 만들어 진다.
        - 만들 수 있는 갑옷의 개수
    > N 개의 재료가 주어짐

stdin : 첫 줄에는 재료의 개수가 주어짐 (N)
        두번째 줄에는 갑옷이 완성도는 번호의 합이 주어짐 (M)
        세번째 줄에는 재료들이 주어짐
 */

import java.util.Scanner;

public class TEST007
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int cnt = 0;

        int[] material = new int[N];

        for (int i = 0; i < N; i++)
        {
            material[i] = scan.nextInt();
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = N - 1; j > i; j--)
            {
                if (material[j] + material[i] == M)
                {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
