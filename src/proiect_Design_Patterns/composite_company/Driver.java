package proiect_Design_Patterns.composite_company;

public class Driver
{
    public static void main(String[] args)
    {
        Employee e1 = new Developer(12, "Ion", 6700);
        Employee e2 = new Developer(13, "Marcel", 3200);
        Employee e3 = new HrSpecialist(24, "Cristina", 5000);
        Employee e4 = new HrSpecialist(25, "Mihaela", 2000);
        Employee e5 = new Developer(14, "Sorin", 10000);
        Employee e6 = new HrSpecialist(26, "Andreea", 7400);
        Employee e7 = new Developer(15, "Valentin", 2800);

        Manager m1 = new Manager(1, "Dumitru", 14000);
        m1.isSupervising(e1);
        m1.isSupervising(e2);
        m1.isSupervising(e3);
        System.out.println(m1);

        Manager m2 = new Manager(2, "Daniela", 18200);
        m2.isSupervising(e4);
        m2.isSupervising(e5);
        m2.isSupervising(e6);
        m2.isSupervising(e7);
        System.out.println(m2);

        m1.rewardEmployee(e2, 245);
        // won't change e7's salary,e7 is not supervised by m1
        m1.rewardEmployee(e7, 20000);
        m2.rewardSupervised(79);

        System.out.println(m1);
        System.out.println(m2);
    }
}
