public class Program
{
	public static void main(String[] args)
	{
		User user1 = new User("Alvares", 20);
		User user2 = new User("Negredo", 40);
		User user3 = new User("eleven", -40);

		user2.setId(2);
		user1.setId(1);
		printUser(user1);
		printUser(user2);
		printUser(user3);
		Transaction trans1 = new Transaction(user1, user2, 40, Transaction.Category.INCOME);
		printTransaction(trans1, user1);
		printUser(user1);
	}

	public static void printUser(User user)
	{
		System.out.print("Name : "+user.getName());
		System.out.print(" , Id Number : "+user.getId());
		System.out.print(" with balance of "+user.getBalance()+ "$\n");
	}

	/*
	* this function is used to print the transaction informations
	*
	* */
	public static void printTransaction(Transaction tr, User user)
	{
		System.out.print(tr.getSender().getName() + " -> "+tr.getRecipient().getName());
		System.out.print(", -"+ tr.getAmount() +", "+tr.getCategory());
		System.out.print(", transaction "+ tr.getIdentifier()+ "\n");
		System.out.print(tr.getRecipient().getName() + " -> "+tr.getSender().getName());
		System.out.print(", +"+ tr.getAmount() +", "+tr.getCategory());
		System.out.print(", transaction "+ tr.getIdentifier()+ "\n");
	}

}