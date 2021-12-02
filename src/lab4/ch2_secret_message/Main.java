package lab4.ch2_secret_message;

public class Main
{
    public static void main(String[] args)
    {
        Decoder decoder01 = new Decoder("./src/lab4/ch2_secret_message/coded_message.TXT");
        System.out.println(decoder01.getSecretMessage());

        System.out.println();

        Decoder decoder02 = new Decoder("./src/lab4/ch2_secret_message/example_text.TXT");
        System.out.println(decoder02.getSecretMessage());
    }
}
