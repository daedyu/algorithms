package TEST;

import java.util.Scanner;

public class TEST021
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] A = new int[N];

        int swap = 0;

        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < N - 1; i++)
        {
            if (A[i] > A[i + 1])
            {
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
                swap += 1;
            }
        }

        System.out.println(swap);
    }
}
