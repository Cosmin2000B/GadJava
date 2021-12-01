package lab3.ch3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy implements RealEstateAgent
{
    private RealEstateAgent agent;
    private List<Apartment> apartments;

    public RealEstateAgentProxy(RealEstateAgent agent)
    {
        this.agent = agent;
    }

    public RealEstateAgentProxy()
    {
        //
    }

    @Override
    public void represent(Apartment apartment)
    {
        if(apartments == null)
            apartments = new ArrayList<>();

        apartments.add(apartment);
    }

    @Override
    public Apartment rent(Student student)
    {
        if(student.getName().startsWith("P") || student.getName().startsWith("p"))
            return null;

        for(Apartment apartment: apartments)
            if(student.getMoney() >= apartment.getMonthlyRentCost())
                return apartment;

        return null;
    }
}
