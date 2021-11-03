package lab1.ch1;

public class Ex1 {
    public void fizzBuzz()
    {
        for(int i = 1; i <= 100; ++i) {
            if(i%3 == 0)
               System.out.print("Fizz ");
            else if(i%5 == 0)
                System.out.print("Buzz ");
            else
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Ex1 x = new Ex1();
        x.fizzBuzz();
    }
}

