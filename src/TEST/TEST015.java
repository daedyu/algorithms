package TEST;

/*
수 정렬하기
    N 개의 수가 주어졌을때 이를 오름차순 정렬하는 프로그램

    stdin
        > 1번째 줄에 수의 개수 N
          2번째 줄부터 N개의 숫자가 주어짐
          * 수는 중복되지 않음
 */

import java.util.*;

public class TEST015
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
        {
            priorityQueue.add(scan.nextInt());
        }

        for (int i = 0; i < N; i++)
        {
            System.out.println(priorityQueue.poll());
        }
    }
}
