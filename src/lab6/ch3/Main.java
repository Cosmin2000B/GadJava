package lab6.ch3;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BellTriangle bt = new BellTriangle();
        bt.printTriangle(n);
    }
}
