package TEST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TEST071
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            linkedList.add(scan.nextInt());
        }

        for (int i = 0; i < M*K; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt() - 1;
            int c = scan.nextInt();

            if (a == 2)
            {
                int x = 0;
                for (int j = b ; j < c; j++)
                {
                    x += linkedList.get(j);
                }

                arrayList.add(x);
                continue;
            }

            linkedList.remove(b);
            linkedList.add(b, c);
        }

        for (int k : arrayList)
        {
            System.out.println(k);
        }
    }
}
