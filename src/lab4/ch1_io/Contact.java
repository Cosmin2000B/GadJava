package lab4.ch1_io;

public class Contact
{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return "Phone number of " + this.name + " " + this.phoneNumber;
    }
}
