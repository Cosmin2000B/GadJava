package lab5.ch1;

public class Main
{
    public static void main(String[] args)
    {
        ExchangeDesk exchangeDesk = new ExchangeDesk();

        Ron lei = new Ron(1000);
        Usd dollar = new Usd(exchangeDesk.convert(lei, new Usd(0)));

        System.out.println(dollar.getValue());

        Usd dollar2 = new Usd(300);
        Ron lei2 = new Ron(exchangeDesk.convert(dollar2, new Ron(0)));

        System.out.println(lei2.getValue());

        // Stage 2

        exchangeDesk.addRate(new Ron(0), new Usd(0), 5d);

        dollar = new Usd(exchangeDesk.convert(lei, new Usd(0)));
        System.out.println(dollar.getValue());

    }
}
