package lab4.ch2_secret_message;

import java.io.*;
import java.util.Scanner;

public class Decoder
{
    private String secretMessage;

    public Decoder(String inputFile)
    {
        Scanner from = null;

        try
        {
            from = new Scanner(new BufferedReader(new FileReader(inputFile)));

            secretMessage = "";

            while(from.hasNext())
            {
                String word = from.next();
                char[] wordC = word.toCharArray();

                for(char c: wordC)
                {
                    if (c == 'X')
                        secretMessage += ' ';
                    else if ('A' <= c && c <= 'Z')
                        secretMessage += c;
                }
            }
        }
        catch(IOException e)
        {
            System.out.println(e + " " + e.fillInStackTrace());
        }
        finally
        {
            if(from != null)
                from.close();
        }
    }

    public String getSecretMessage()
    {
        return this.secretMessage;
    }
}
