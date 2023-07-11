package TEST;

public class DFS
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>(10, new LinkedList<>(11, null));

        System.out.println(linkedList.pollPtr().poll());
    }
}
/*
깊이 우선 검색
    dfs
    꺼내고 자식노드를 스택에 추가 추가
    다시 꺼내고 스택에 추가  ----- 순으로 간다
넓이 우선 검색
    bfs
 */

