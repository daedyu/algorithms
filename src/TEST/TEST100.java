package TEST;

/*
N개의 수 와 L 이 주어진다 주어진 수 중 최솟값을 D 라고 할때 D에 저장된 수를 출력하시오
공식 A(iL-1)~Ai to min -> D

stdin : 1번째 줄에 N과 L 이 주어진다.
        2번째 줄에 N개의 수 A가 주어진다.
        A = int
 */

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TEST100
{
    static class Node
    {
        public int value;
        public int index;

        Node (int value, int index)
        {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); // throws IOException 을 꼭 해주어야 한다.

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Node> A = new LinkedList<>();

        for (int i = 0; i < N; i++)
        {
            int now = Integer.parseInt(st.nextToken());

            while (!A.isEmpty() && A.getLast().value > now)
            {
                A.removeLast();
            }
            A.addLast(new Node(now, i));

            if (A.getFirst().index <= i - L)
            {
                A.removeFirst();
            }
            bw.write(A.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
}
