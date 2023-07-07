package module01.ex00;
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
		if (category == Category.OUTCOME && amount > 0)
		{
			System.out.println("Invalid transaction 1");
			System.exit(-1);
		}
		else if (category == Category.INCOME && amount < 0)
		{
			System.out.println("Invalid transaction 2");
			System.exit(-1);
		}
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
