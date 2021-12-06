package lab7.ch2;

import java.awt.image.BandCombineOp;

public class BankAccount
{
    private String name;
    private int debit;

    public BankAccount(String name, int debit)
    {
        this.name = name;
        this.debit = debit;
    }

    synchronized public void withdraw(double ammount) throws InsufficientFoundException
    {
        longDatabaseCall();

        if(ammount > debit)
            throw new InsufficientFoundException();

        this.debit -= ammount;
    }

    synchronized public void deposit(double ammount)
    {
        longDatabaseCall();
        this.debit += ammount;
    }

    void longDatabaseCall()
    {
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        return "Bank account named " + name + " has the following debit " + debit;
    }
}
