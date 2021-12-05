package lab5.ch1;

public class Ron implements Currency
{
    private double value;
    private static double rate;

    public Ron(double value)
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
            return 4d;
        else
            return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }
}
