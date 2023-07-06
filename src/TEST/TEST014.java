package TEST;

/*
절댓값 힙 구하기
    절댓값 힙은 다음 연산을 지원하는 자료구조
    배열에 정수 x를 넣는다.
    배열에서 절댓값이 가장 작은 수를 출력한 후 그 값을 배열에서 제거한다.
    절댓값이 가장 작은 값이 여러 개일 경우에는 그중 가장 작은 수를 출력하고 그 값을 배열에서 지운다.

 */

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TEST014
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> {
            int absO1 = Math.abs(o1);
            int absO2 = Math.abs(o2);

            if (absO1 == absO2)
            {
                return o1 > o2 ? 1: -1;
            }
            else
            {
                return absO1 - absO2;
            }
        }));

        int[] x = new int[N];

        for (int i = 0; i < N; i++)
        {
            x[i] = scan.nextInt();
        }

        for (int i = 0; i < N; i++)
        {
            if (x[i] == 0)
            {
                Integer k = queue.poll();
                if (k == null)
                {
                    System.out.println(0);
                }
                else
                {
                    System.out.println(k);
                }
            }
            else
            {
                queue.add(x[i]);
            }
        }
    }
}
