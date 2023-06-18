package module00.ex02;
import java.util.Scanner;

public class Program {
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
		Scanner sc = new Scanner(System.in);
		int	nbrRequest;
		int	nbr;
		
		nbrRequest = 0;
		do
		{
			System.out.format("-->");
			nbr = sc.nextInt();
			if (isPrime(sumNbr(nbr)))
			{
				nbrRequest++;
			}
		} while (nbr != 42);
		sc.close();
		System.out.format("   Count of coffee-request : "+nbrRequest);
	}
}
