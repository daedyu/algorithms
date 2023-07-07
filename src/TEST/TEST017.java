package TEST;

import java.util.*;

public class TEST017
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();

        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++)
        {
            arr[i] = Integer.parseInt(N.substring(i, i + 1));
        }

        Arrays.sort(arr);



        for (int i = N.length() - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
    }
}
