package lab4.ch1_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Phonebook
{
    private int counter;
    private Contact[] contacts = new Contact[10];

    public Phonebook(String inputFile)
    {
        Scanner s = null;

        try
        {
            s = new Scanner(new BufferedReader(new FileReader(inputFile)));
            String name;
            String number;

            while(s.hasNext())
            {
                name = s.next();
                if(s.hasNext())
                {
                    number = s.next();
                    storeContact(new Contact(name, number));
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(s != null)
                s.close();
        }
    }

    private void storeContact(Contact contact)
    {
        if(counter < contacts.length)
            contacts[counter++] = contact;
        else
        {
            int i = 0;
            Contact[] newContacts = new Contact[contacts.length * 2];

            for(Contact currentContact: contacts)
                newContacts[i++] = currentContact;

            newContacts[i++] = contact;
            contacts = newContacts; // actualizare contacts
            counter = i;
        }
    }

    public Contact findContact(String name)
    {
        for(int i = 0; i < this.counter; ++i)
            if(this.contacts[i].getName().equals(name))
                return contacts[i];

        return null;
    }

    @Override
    public String toString()
    {
        String toReturn = "";
        for(int i = 0; i < this.counter; ++i)
            toReturn += contacts[i];

        return toReturn;
    }
}
