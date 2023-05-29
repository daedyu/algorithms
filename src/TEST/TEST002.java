package TEST;

import java.util.Scanner;

public class TEST002
{
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner(System.in);
//        short N = scan.nextShort();
//
//        int sum = 0;
//        int [] subArray = new int[N];
//        int max = 0;
//        for (int i = 0; i < N; i++)
//        {
//            int subject = scan.nextInt();
//            try {
//                if (subject < 0 || subject > 100)
//                {
//                    throw new Exception();
//                }
//            }catch (Exception e)
//            {
//                System.out.println("값은 0이상 100 이하여야 합니다.");
//                return;
//            }
//
//            if (max < subject)
//            {
//                max = subject;
//            }
//            subArray[i] = subject;
//        }
//
//        for (int i = 0; i < N; i++)
//        {
//            subArray[i] = (subArray[i] / max) * 100;
//            sum += subArray[i];
//        }
//
//        sum = sum / N;
//
//        System.out.println(sum);

        //정답
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++)
        {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }

        System.out.println(sum * 100.0 / max /N);
    }
}

