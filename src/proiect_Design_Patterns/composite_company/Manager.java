package proiect_Design_Patterns.composite_company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee
{
    private List<Employee> supervised;

    public Manager(int id, String name, int salary)
    {
        super(id, name, salary);
        supervised = new ArrayList<Employee>();
    }

    public void isSupervising(Employee e)
    {
        supervised.add(e);
    }

    public void noLongerSupervising(Employee e)
    {
        if(supervised.isEmpty())
            return;

        if(supervised.contains(e) == false)
            return;

        if(supervised.contains(e))
            supervised.remove(e);
    }

    public void rewardEmployee(Employee e, int sum)
    {
        if(e == null)
            return;

        if(supervised.contains(e))
            e.setSalary(e.getSalary() + sum);
    }

    public void rewardSupervised(int sum)
    {
        if(supervised.isEmpty())
            return;

        for(Employee employee: supervised)
            employee.setSalary(employee.getSalary() + sum);
    }

    @Override
    public String toString()
    {
        String toReturn = "Manager " + this.getName() + ", with id " + this.getId() + " ";

        if(supervised.isEmpty())
            toReturn += "isn't supervising anyone";
        else
        {
            toReturn += "is supervising the next emplyees:\n";

            for(Employee employee: supervised)
            {
                toReturn += "  * ";
                toReturn += employee.toString();
                toReturn += '\n';
            }
        }

        return toReturn;
    }
}
