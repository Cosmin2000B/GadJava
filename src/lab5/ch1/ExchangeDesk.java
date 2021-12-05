package lab5.ch1;

public class ExchangeDesk
{
    public <X extends Currency, Y extends Currency> double convert(X currency1, Y currency2)
    {
        return  currency1.getValue() * currency2.getRate();
    }

    public <X extends Currency, Y extends Currency> void addRate(X currency1, Y currency2, double rate)
    {
        currency1.setRate(rate);
        currency2.setRate(1d / rate);
    }

    /*
    public void addRate(Class<Ron> ronClass, Class<Usd> usdClass, double rate)
    {
        //
    }
    */

}
