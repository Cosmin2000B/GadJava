package lab9;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class ex2
{
    public static void main(String[] args) throws InterruptedException
    {
        Flux.interval(Duration.ofMillis(250))
                .map(input ->
                {
                    if(input < 3)
                        return "tick" + input;
                    System.out.println("here");
                    throw new RuntimeException("boom");
                })
                .retry(1)
                .elapsed()
                .subscribe(System.out::println, System.err::println);

        Thread.sleep(2100);
    }
}
