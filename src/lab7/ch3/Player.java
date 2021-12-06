package lab7.ch3;

import java.util.HashMap;
import java.util.Random;

public class Player extends Thread
{
    private String name;
    private String option;
    private static final HashMap<Integer, String> options = new HashMap<>(){{put(0, "rock");
                                                                            put(1, "paper");
                                                                            put(2, "scrissors");
                                                                           }};

    public Player(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        option = options.get(new Random().nextInt(2));
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "name=" + name + '\'' +
                ", option='" + option + '\'' +
                '}';
    }

    public String getOption()
    {
        return option;
    }
}
