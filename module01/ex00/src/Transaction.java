import java.util.UUID;

public class Transaction {
	private UUID	identifier;
	private User	recipient;
	private User	sender;
	private Integer	amount;
	
	public enum Category
	{
		INCOME,
		OUTCOME,
	}

	private Category category;

	public Transaction(User recipient, User sender, Integer amount, Category category)
	{
		if (category == Category.OUTCOME && amount > (Integer) 0)
		{
			System.out.println("Invalid transaction 1");
			System.exit(-1);
		}
		else if (category == Category.INCOME && amount < (Integer) 0)
		{
			System.out.println("Invalid transaction 2");
			System.exit(-1);
		}
		if (sender.getBalance() - amount < 0)
		{
			System.out.println("to make this transaction you still need "+(sender.getBalance() - amount));
			System.exit(-1);
		}
		recipient.setBalance(recipient.getBalance() + amount);
		sender.setBalance(sender.getBalance() - amount);
		setCategory(category);
		setRecipient(recipient);
		setSender(sender);
		setAmount(amount);
	}

	public UUID getIdentifier()
	{
		return (identifier);
	}

	public void setIdentifier(UUID identifier)
	{
		this.identifier = identifier;
	}

	public User getRecipient()
	{
		return (recipient);
	}

	public void setRecipient(User recipient)
	{
		this.recipient = recipient;
	}

	public User getSender()
	{
		return (sender);
	}

	public void setSender(User sender)
	{
		this.sender = sender;
	}

	public Integer getAmount()
	{
		return (amount);
	}

	public void setAmount(Integer amount)
	{
		this.amount = amount;
	}

	public Category getCategory()
	{
		return (category);
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

}
