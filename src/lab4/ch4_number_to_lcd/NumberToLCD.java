package lab4.ch4_number_to_lcd;

public class NumberToLCD
{
    private int number;
    private int height = 3;
    private int width = 1;

    public NumberToLCD(int number)
    {
        this.number = number;
    }

    public NumberToLCD(int number, int height)
    {
        this.number = number;
        this.height = height;
    }

    public NumberToLCD(int number, int width, boolean distinction)
    {
        this.number = number;
        this.width = width;
    }

    public NumberToLCD(int number, int width, int height)
    {
        this.number = number;
        this.width = width;
        this.height = height;
    }

    public char[][] getLCD()
    {
        char[][] result;

        switch(number)
        {
            case(1):
            {
                result = new char[height][width];

                for(int i = 0; i < height; ++i)
                {
                    for(int j = 0; j < width; ++j)
                        result[i][j] = '|';
                }

                return result;
            }

            case(2):
            {
                result = new char[width - 1][height- 1];

                for(int i = 0; i < width - 1; ++i)
                {
                    if(i == 0 || i == height/2 || i == height - 1)
                    {

                    }
                }
            }
        }

        return null;
    }
}
