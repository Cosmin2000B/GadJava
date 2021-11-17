package lab5.ch2;

public class Driver
{
    public static void main(String[] args) throws Exception {
        Boot boot1 = new Boot(20, "Red");
        Boot boot2 = new Boot(20, "Red");
        Running running1 = new Running(20, "Red");
        Running running2 = new Running(22, "Red");

        try
        {
            // pereche 2 elem de tip Boot
            Pair<Boot> pair1 = new Pair<>(boot1, boot2);
            Pair<Running> pair2 = new Pair<>(running1, running2);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

        /* -- incorect, tipuri diferite!
        Pair<Boot> pair2 = new Pair<>(boot1, running2);
         */

    }
}
