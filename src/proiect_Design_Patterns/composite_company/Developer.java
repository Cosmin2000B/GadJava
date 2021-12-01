package proiect_Design_Patterns.composite_company;

public class Developer extends Employee
{
    public Developer(int id, String name, int salary)
    {
        super(id, name, salary);
    }

    @Override
    public String toString()
    {
        return this.getName() + ", working as a developer with id " + this.getId()
                + " for this salary " + this.getSalary();
    }
}
