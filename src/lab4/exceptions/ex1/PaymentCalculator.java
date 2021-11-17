package lab4.exceptions.ex1;

import java.awt.desktop.SystemSleepEvent;

public class PaymentCalculator
{
    public int process(int nr)
    {
        if(nr == 0)
        {
            // throw unchecked exception
            throw new DivByZeroException();
        }

        return 5000/nr + 300;
    }

    public int calculate(int numberOfHours)
    {
        int result = 0;

        // checked exception -> trebuie pus try{}catch{}

        try
        {
            extracted(numberOfHours);
        }
        catch (FewHoursException ex)
        {
            System.out.println("Not enough hours exception occured.");
            numberOfHours = 31;
        }
        result = process(numberOfHours);

        return result;
    }

    private void extracted(int numberOfHours) throws FewHoursException
    {
        if(numberOfHours < 30 && numberOfHours > 0)
        {
            // throw checked exception
            throw new FewHoursException();
        }
    }
}
