package lab7.ch2;

public class TransactionThread extends Thread
{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int ammount;

    public TransactionThread(String name, BankAccount from, BankAccount to,int ammount)
    {
        this.name = name;
        this.from = from;
        this.to = to;
        this.ammount = ammount;
    }

    @Override
    public void run()
    {
        transfer();
    }

    private void transfer()
    {
        try
        {
            from.withdraw(ammount);
            to.deposit(ammount);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() + " in transaction " + name);
        }

        System.out.println("Transfer " + name + " was executed.");
        System.out.println("From: " + from);
        System.out.println("To: " + to);
    }
}
