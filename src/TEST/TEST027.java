package TEST;

import java.util.*;

public class TEST027
{
    public static int[][] Board;

    public static boolean[][] visited;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        Board = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++)
        {
            String x = scan.next();
            for (int j = 0; j < M; j++)
            {
                Board[i][j] = Integer.parseInt(x.substring(j, j+1));
            }
        }
    }
}
