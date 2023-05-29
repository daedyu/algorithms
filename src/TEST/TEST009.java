package TEST;

/*
DNA 비밀번호
    > DNA 문자열 -> {A,C,G,T} 로 이루어진 문자열
    > 보안 규칙
        - A 1개이상
        - C 1개이상
        - G 1개이상
        - T 0개이상 -- 조건은 커스텀 가능

stdin : 첫번째 줄에 문자열의 길이 S 가 주어짐 (S)
        첫번째 줄에 사용할 문자의 길이 P가 주어짐 (P)
        두번째 즐에 DNA 문자열이 주어짐
        세번째 줄에  A, C, G, T 의 최소의 개수가 주어짐
 */

import java.util.Scanner;

public class TEST009
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int S = scan.nextInt();
        int P = scan.nextInt();
        int cnt = 0;

        String DNA = scan.next();

        char[] arr = DNA.toCharArray();

        int A = scan.nextInt();
        int C = scan.nextInt();
        int G = scan.nextInt();
        int T = scan.nextInt();

        for (int i = 0; i < S; i++)
        {
            int a = A;
            int c = C;
            int g = G;
            int t = T;
            for (int j = i;(j < j + P) && (j < S); j++)
            {
                switch (arr[j]) {
                    case 'A' -> a--;
                    case 'C' -> c--;
                    case 'G' -> g--;
                    case 'T' -> t--;
                    default -> System.exit(1);
                }
            }

            if (a <= 0 && c <= 0 && g <= 0 && t <= 0)
            {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}
