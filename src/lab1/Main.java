package lab1;

public class Main {
    /*
    public static void main(String[] args)
    {
        System.out.println("Hello World from InteliJ!");
    }
     *///  1.Hello World

    /*
    public static void main(String[] args)
    {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'e'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(copyTo);
    }
     *///  System.arraycopy()

    public static void main(String[] args)
    {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'e', 'i', 'n', 'a'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2 , 9);

        System.out.println(copyTo);

    }

}
