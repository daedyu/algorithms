package TEST;

/*
스택으로 오름파순 수열 만들기
1부터 n까지 수를 스택에 저장, 출력 -> 하나의 수열
1부터 오름차순으로 스택에 push.
수열이 주어질때 이 방식으로 주어진 수열이 가능한지 확인
    가능하면 어떻게 push, pop 수행 여부 확인 -> 불가능일시 No 출력
    > push 연산은 + pop 연산은 -로 출력

stdin : 첫번째 줄에 수열의 개수 n 입력
        두번째 줄에는 1이상 N 이하의 수 1개씩 입력(중복불가)
 */

import java.util.Scanner;
import java.util.Stack;

public class TEST011
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < A.length; i++)
        {
            int su = A[i];
            if (su > num)
            {
                while (su >= num)
                {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else
            {
                int n = stack.pop();

                if (n > su)
                {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else
                {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
