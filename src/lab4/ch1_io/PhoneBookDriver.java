package lab4.ch1_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PhoneBookDriver
{
    public static void storeContactToFile(String fileName, Contact contact)
    {
        BufferedWriter bufferedWriter = null;

        try
        {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(fileName)));
            bufferedWriter.write(contact.toString());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            //
        }

    }

    public static void main(String[] args)
    {
        Phonebook phoneBook = new Phonebook("./src/lab4/ch1_io/contacts.txt");

        //System.out.println(phoneBook);
        System.out.println(phoneBook.findContact("Abbey"));

        storeContactToFile("./src/lab4/ch1_io/foundContacts.txt", phoneBook.findContact("Abbey"));
    }
}
