package lab2.ch1;

public class Fighter
{
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack)
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter adversary)
    {
            adversary.health -= this.damagePerAttack;
    }

    // setters, getters ---------------------------

    public String getName()
    {
        return this.name;
    }

    public int getHealth()
    {
        return this.health;
    }
}
