package proiect_Design_Patterns.composite_company;

public class HrSpecialist extends Employee
{
    public HrSpecialist(int id, String name, int salary)
    {
        super(id, name, salary);
    }

    @Override
    public String toString()
    {
        return this.getName() + ", working as a Human Resources Specialist with id " + this.getId()
                + " for this salary " + this.getSalary();
    }
}
