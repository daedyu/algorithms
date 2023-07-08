package TEST;

/*
dfs
    깊이 우선 탐색
        > 방향 없는 그래프가 주어졌을때 연결 요소의 개수를 구하는 프로그램 작성
    stdin
        > 첫번째 줄에 노드의 개수와 에지의 개수가 주어짐
          두번째 줄부터 M개의 줄에 에지의 양 끝점 u 와 v 가 주어진다.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TEST023
{
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++)
        {
            int s = scan.nextInt();
            int e = scan.nextInt();
            A[s].add(e);
            A[e].add(s);
        }

        int cnt = 0;

        for (int i = 0; i < n + 1; i++)
        {
            if (!visited[i])
            {
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }

    static void DFS(int v)
    {
        if (visited[v])
        {
            return;
        }
        visited[v] = true;

        for (int i: A[v])
        {
            if (!visited[i])
            {
                DFS(i);
            }
        }
    }
}
