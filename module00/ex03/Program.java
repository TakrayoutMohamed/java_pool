package module00.ex03;
import java.util.Scanner;

public class Program
{
    private static int nbr;
    private static int lastResult;

    private static int minValue(int a, int b)
    {
        if (a > b)
        {
            return (b);
        }
        return (a);
    }

    private static int setLastResult(int week, int minValue)
    {
        return ((minValue - 1) * (int)Math.pow(9, week));
    }

    private static  int extractResult()
    {
        int result = lastResult % 9 + 1;
        lastResult /= 9;
        return (result);
    }

    private static void display(int len)
    {
        while (len > 0) {
            System.out.print("=");
            --len;
        }
        System.out.println(">");
    }

    public static void main(String[] args)
    {
        int minValue;
        String weekNbr;
        int j;
        Scanner sc = new Scanner(System.in);

        j = 0;
        while (j < 18)
        {
            System.err.print("->  ");
            weekNbr = sc.nextLine();
            if (weekNbr.equals("42"))
            {
                break ;
            }
            if (!weekNbr.equals("Week " + (j + 1)))
            {
                System.err.println("IlligalArgument"+weekNbr);
                System.exit(-1);
            }
            System.err.print("->  ");
            minValue = 10;
            for (int i = 0; i < 5; i++)
            {
                nbr = sc.nextInt();
                if (nbr > 9 || nbr < 1)
                {
                    System.err.println("not accepted value");
                    System.exit(-1);
                }
                minValue = minValue(nbr, minValue);
            }
            lastResult += setLastResult(j, minValue);
            j++;
            sc.nextLine();
        }
        sc.close();
        // System.out.format("last Result = "+lastResult+"ooooook\n");
        for (int i = 1; i <= j; ++i) {
            System.out.print("Week "+ (i) + " ");
            display(extractResult());
        }

    }
}
