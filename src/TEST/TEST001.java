package TEST;

import java.util.Scanner;

public class TEST001
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        String arr = scan.next();

        char[] a;

        a = arr.toCharArray();  // toCharArray 가 있기에 a 에 new char[] 를 해줄 필요가 없다.
        int sum = 0;

        for (int i = 0; i < N; i++)
        {
            //sum += (int) a[i] % '0'; // 0의 아스키 코드값을 뺀 나머지 수가 int 형의 수이기 때문 ex) '0' = 70; '2' = 72 '2' % '0' = 2;
            sum += (int) a[i] - '0';    //뺴기를 해 주는것이 더 좋다.
        }

        System.out.println(sum);
    }
}
