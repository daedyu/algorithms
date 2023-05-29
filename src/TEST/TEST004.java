package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TEST004
{
    public static void main(String[] args) throws Exception {
        /**
         * 오답
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int [N + 1][N + 1];
        for (int i = 1; i <= N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++)
            {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int D[][] = new int[N + 1][N + 1];

//
//        for (int j = 1; j <= N; j++)
//        {
//            D[i][j] = D[i][j - 1] + D[i - 1][j] -
//        }
    }
}
