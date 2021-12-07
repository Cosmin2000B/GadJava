package lab6.ch2;

public class PascalTriangle
{
    public void printTriangle(int n)
    {
        int[][] aux = new int[n][n];

        for(int line = 0; line < n; ++line)
        {
            // pe fiecare linie avem nr_linie elemente
            for(int i = 0; i <= line; ++i)
            {
                // elementele de pe margine sunt 1
                if(line == i || i == 0)
                    aux[line][i] = 1;
                else
                    aux[line][i] = aux[line - 1][i - 1] +
                                   aux[line - 1][i];
            }
        }

        int leftSpace = n/2;

        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j <= i; ++j)
            {
                for(int x = 0; x < leftSpace; ++x)
                    System.out.print(" ");
                leftSpace--;

                System.out.print(aux[i][j] + " ");
            }
            System.out.println();
        }
    }
}
