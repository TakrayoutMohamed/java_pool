class Program
{
    public static void main(String[] args)
    {
        int nbr;
        int sum;

        nbr = 12901212;
        sum = 0;
        while (nbr > 0)
        {
            sum = sum + (nbr % 10);
            nbr /= 10;
        }
        System.out.println(sum);
    }
}
