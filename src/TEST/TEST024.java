package TEST;

/*
신기한 소수 찾기
    > 가장 관심있는 소수 = 7331 -> 733도 소수 73 도 소수 7또한 소수

    stdin
        > 첫번째 줄에 자릿수 N이 주어짐
 */

import java.util.Scanner;

public class TEST024
{
    public static int N;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    public static boolean prime_number(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int num, int digit)
    {
        if (digit == N)
        {
            if (prime_number(num))
            {
                System.out.println(num);
            }
            return;
        }

        for (int i = 1; i < 10; i++)
        {
            if (i  % 2 == 0)
            {
                continue;
            }
            if (prime_number(num * 10 + i))
            {
                dfs(num * 10 + i, digit + 1);
            }
        }
    }
}
