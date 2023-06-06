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
     static Stack reverse(Stack<Integer> s)
    {
        Stack<Integer> stack = new Stack<>();

        for (int i = s.toArray().length - 1; i >= 0; i--)
        {
            Object[] arr = s.toArray();
            stack.push((Integer) arr[i]);
        }
        return stack;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++)
        {
            int k = scan.nextInt();
            integerStack.push(k);
        }

        new int

        for (int i = 0; i < n; i++)
        {

        }
    }
}
