package module00.ex04;
import java.util.Scanner;

public class Program {
	private static String	a;
	private static final int MAX_CHAR_CODE = 65535;
	private static char[]	strArray;
	
	public static	char[] countChars(String input)
	{
		char[] inputArray = input.toCharArray();
		int inputLen = input.length();
		char[] charTable = new char[MAX_CHAR_CODE];
		for (int i = 0; i < inputLen; i++)
		{
			charTable[inputArray[i]] += 1;
		}
		System.out.print("the array is |"+(int)charTable['d']+"| func\n");
		return (charTable);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		a = sc.nextLine();
		// strArray[].toCharArray();
		for (int i = 0; i < a.length(); i++)
		{
			// strArray[i] = a[i];
		}
		strArray = countChars(a);
		System.out.print("|"+a+"|\n");
		System.out.print("|"+(int) strArray['a']+"|\n");
		System.out.print("the length is |"+MAX_CHAR_CODE+"|\n");
		sc.close();
	}
}
