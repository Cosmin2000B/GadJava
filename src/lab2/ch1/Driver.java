package lab2.ch1;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("First fighter name:");
        String name = in.nextLine();
        System.out.print("First fighter health:");
        int health = in.nextInt();
        System.out.print("First fighter damagePerAttack:");
        int damagePerAttack = in.nextInt();

        in.nextLine(); // ----- clear line
        System.out.println();

        Fighter fighter1 = new Fighter(name, health, damagePerAttack);

        System.out.print("Second fighter name:");
        String name2 = in.nextLine();
        System.out.print("Second fighter health:");
        health = in.nextInt();
        System.out.print("Second fighter damagePerAttack:");
        damagePerAttack = in.nextInt();

        Fighter fighter2 = new Fighter(name2, health, damagePerAttack);

        BoxingMatch boxMatch = new BoxingMatch(fighter1, fighter2);
        String winner = boxMatch.fight();

        System.out.println("Winner is: " + winner);
    }
}
