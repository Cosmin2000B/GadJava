package lab4.ch3_anagram;

import java.io.*;
import java.util.Scanner;

public class Anagram
{
    public  void readInputAndSolve(String file)
    {
        Scanner input = null;

        try
        {
            input = new Scanner(new BufferedReader(new FileReader(file)));

            while(input.hasNext())
            {
                String word = input.next();System.out.println(word);
                int size = word.length() - 1;

                writeToFile("Anagrams for the word " + word + " are:");
                showAnagrams(word, 0, size);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            if(input != null)
                input.close();
        }
    }

    // backtracking for permutations
    private void showAnagrams(String s, int start, int end)
    {System.out.println(s);
        if(start == end)
            writeToFile(s);
        else
        {
            for(int i = start; i <= end; ++i)
            {
                s = swap(s, start, i);
                showAnagrams(s, start + 1, end);
                s = swap(s, start, i);
            }
        }
    }

    // swap two letters in a string
    private String swap(String s, int first, int second)
    {
        char aux;
        char[] schar = s.toCharArray();

        aux = schar[first];
        schar[first] = schar[second];
        schar[second] = aux;

        return schar.toString();
    }

    private void writeToFile(String output)
    {
        BufferedWriter out = null;

        try
        {
            out = new BufferedWriter(new FileWriter(new File("./src/lab4/ch3_anagram/output.txt")));
            out.write(" " + output);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally
        {
           //
        }
    }
}
