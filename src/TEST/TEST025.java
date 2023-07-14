package TEST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEST025
{
    static List<List<Integer>> lists;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        lists = new ArrayList<>(N);
        for (int i = 0; i < N; i++)
        {
            lists.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            lists.get(a).add(b);
            lists.get(b).add(a);
        }

        if (checkFriend())
        {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean checkFriend()
    {

        int[] num = {0, 1, 2, 3, 4};


        for (int i = 0; i < num.length; i++)
        {
            boolean[] List_bool = new boolean[lists.size()];
            int start = num[i];

            List_bool[start] = true;

            for (int friend : lists.get(start))
            {
                List_bool[friend] = true;

                for (int friendOfFriend : lists.get(friend))
                {
                    List_bool[friendOfFriend] = true;
                }
            }

            boolean Friends = true;
            for (int j = 0; j < num.length; j++)
            {
                if (!List_bool[num[j]])
                {
                    Friends = false;
                    break;
                }
            }

            if (Friends)
            {
                return true;
            }
        }

        return false;
    }
}