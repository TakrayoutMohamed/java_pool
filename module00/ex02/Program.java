package module00.ex02;
import java.util.Scanner;

public class Program {
	private static int scanInput()
	{
		int queries;
		Scanner sc = new Scanner(System.in);

		System.out.format("-->");
		queries = sc.nextInt();
		// sc.close();
		return (queries);
	}

	private static boolean isPrime(int nbr)
	{
		int	i;

		i = 2;
		while (i <= Math.round(Math.sqrt(nbr)))
        {
            if (nbr % i == 0)
            {
                return (false);
            }
            if (i == Math.round(Math.sqrt(nbr)))
            {
				return (true);
            }
            i++;
        }
		return (true);
	}

	private static int sumNbr(int nbr)
	{
        int sum;

        sum = 0;
        while (nbr > 0)
        {
            sum = sum + (nbr % 10);
            nbr /= 10;
        }
		return (sum);
	}

	public static void main(String[] args)
	{
		int	nbrRequest;
		int	nbr;
		
		nbrRequest = 0;
		do
		{
			nbr = scanInput();
			if (isPrime(sumNbr(nbr)))
			{
				nbrRequest++;
			}
		} while (nbr != 42);
		System.out.format("   Count of coffee-request : "+nbrRequest);
	}
}
