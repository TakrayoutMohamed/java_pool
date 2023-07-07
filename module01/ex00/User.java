package module01.ex00;

public class User {
    private Integer id;
    private String  name;
    private Integer balance;

    public User(String name, Integer balance)
    {
        if (balance < 0)
        {
            System.out.println("invalid balance");
            System.exit(-1);
        }
        setName(name);
        setBalance(balance);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return (name);
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return (id);
    }

    public void setBalance(Integer balance)
    {
        this.balance = balance;
    }

    public Integer getBalance()
    {
        return (balance);
    }
}
