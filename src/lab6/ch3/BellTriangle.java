package lab6.ch3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BellTriangle
{
    public void printTriangle(int n) throws IOException
    {
        int[][] bell = new int[n + 1][n + 1];
        BufferedWriter out = null;

        try
        {
            out = new BufferedWriter(new FileWriter("./src/lab6/ch3/output.txt"));

            bell[0][0] = 1;
            out.write(bell[0][0] + " ");
            out.write('\n');

            for(int i = 1; i < n; ++i)
            {
                bell[i][0] = bell[i-1][i-1];
                out.write(bell[i][0] + " ");

                for(int j = 1; j <= i; ++j)
                {
                    bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
                    out.write(bell[i][j] + " ");
                }
                out.write('\n');
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(out != null)
                out.close();
        }
    }
}
