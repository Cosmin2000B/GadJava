package lab2.ch2;

public class MovieDatabaseDriver
{
    public static void moreThanTwoMovies(Studio[] studioDatabase)
    {
        System.out.println("Studiourile cu mai mult de 2 filme:");

        for(Studio studio: studioDatabase)
            if(studio.getFilme().length > 2)
                System.out.println(studio.getNume());
    }

    public static void hasActorCu2Oscaruri(Studio[] studioDatabase)
    {
        System.out.println("Studiourile in care joaca actor cu 2 oscaruri sunt:");

        for(Studio studio: studioDatabase)
        {
            for(Film film: studio.getFilme())
            {
                for(Actor actor: film.getActori())
                    if(actor.getNume().equals("actor cu 2 oscaruri"))
                        System.out.println(studio.getNume());
            }
        }
    }

    public static void main(String[] args)
    {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);


        Actor actorOscar1990 = new
                Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2000 = new
                Actor("actor cu oscar in 2010",55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new
                Actor("actor cu oscar in 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new
                Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new
                Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new
                Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film
                (1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film
                (2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film
                (2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film
                (2018, "film cu actori de oscar", new Actor[]{actorOscar2000, actorOscar2018, actorFaraPremii02});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film1, film3, film4});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        // Stage 3

        // 1.
        moreThanTwoMovies(studioDatabase);

        // 2.
        hasActorCu2Oscaruri((studioDatabase));

        // 3.


    }
}
