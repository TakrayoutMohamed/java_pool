import java.util.Scanner;

class   Program
{
    private static boolean isDivider(int dividedBy, int nbr)
    {
        return ((nbr % dividedBy != 0) ? false : true);
    }

    public static void main(String[] args)
    {
        int nbr;
        int i;

        i = 2;
        System.out.print("-> ");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextInt();
        sc.close();
        if (nbr < 2)
        {
            System.err.format("IllegalArgument");
            System.exit(-1);
        }
        while (i <= Math.round(Math.sqrt(nbr)))
        {
            if (isDivider(i, nbr))
            {
                System.out.print("false "+ (i - 1));
                break ;
            }
            if (i == Math.round(Math.sqrt(nbr)))
            {
                System.out.println("true "+(i - 1));
            }
            i++;
        }
    }
}
