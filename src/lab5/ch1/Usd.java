package lab5.ch1;

public class Usd implements Currency
{
    private double value;
    private static double rate;

    public Usd(double value)
    {
        this.value = value;
    }

    @Override
    public double getValue()
    {
        return value;
    }

    @Override
    public double getRate()
    {
        if(rate == 0)
            return 0.25d;
        else
            return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }
}
