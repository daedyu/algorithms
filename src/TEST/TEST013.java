package TEST;

/*
카드게임

    N장의 카드가 있다. 각각의 카드는 차례로 1에서 N까지의 번호가 있다.
    1번 카드가 위 N이 아래
    가장 위에 있는 카드를 버린다. 그다음 가장 위에 있는 카드를 가장 아래에 있는 카드 맡으로 옮긴다.
    > 두개가 쌍을 이루어 작동한다.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TEST013
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++)
        {
            queue.add(i);
        }

        while (queue.size() > 1)
        {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
