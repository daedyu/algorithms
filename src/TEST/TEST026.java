package TEST;

import java.text.DateFormatSymbols;
import java.util.*;

public class TEST026
{
    public static int N;
    public static int M;
    public static int V;

    public static ArrayList<Integer>[] A;
    public static boolean[] VISITED;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        M = scan.nextInt();

        V = scan.nextInt();

        A = new ArrayList[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = new ArrayList<>();
        }

        VISITED = new boolean[N];

        Arrays.fill(VISITED, false);

        for (int i = 0; i < M; i++)
        {
            int edge1 = scan.nextInt() - 1;
            int edge2 = scan.nextInt() - 1;

            A[edge1].add(edge2);
            A[edge2].add(edge1);
        }

        DFS(V - 1, 1);

        System.out.print("\n");

        BFS(V - 1, 1);
    }

    public static void DFS(int num, int digit)
    {
        if (digit >= N)
        {
            return;
        }

        if (VISITED[num])
        {
            return;
        }

        System.out.print(num + 1 + " ");

        VISITED[num] = true;

        Collections.sort(A[num]);   // Important

        for (int nums : A[num])
        {
            DFS( nums, digit + 1);
        }
    }
    public static void BFS(int num, int digit)
    {
        Arrays.fill(VISITED, false);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(num);

        while (!queue.isEmpty())
        {

            int nums = queue.poll();

            if (VISITED[nums])
            {
                break;
            }

            Collections.sort(A[nums]);

            for (int x: A[nums])
            {
                if (VISITED[x])
                {
                    continue;
                }
                queue.add(x);
            }

            VISITED[nums] = true;

            System.out.print(nums + 1 + " ");
        }
    }
}
