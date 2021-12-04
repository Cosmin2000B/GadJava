package lab4.ch3_anagram;

public class Main
{
    public static void main(String[] args)
    {
        Anagram a = new Anagram();

        a.readInputAndSolve("./src/lab4/ch3_anagram/small_list.TXT");
        a.readInputAndSolve("./src/lab4/ch3_anagram/big_list.TXT");
    }
}
