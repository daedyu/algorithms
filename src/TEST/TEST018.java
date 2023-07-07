package TEST;

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
