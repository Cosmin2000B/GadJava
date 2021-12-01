package lab3.ch3;

public class Apartment
{
    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost)
    {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public int getMonthlyRentCost()
    {
        return this.monthlyRentCost;
    }

    @Override
    public String toString()
    {
        return "apartamentul situat in " + this.location + ", avand chiria lunara de " +
                this.monthlyRentCost + " lei";
    }
}
