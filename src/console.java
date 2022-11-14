/*
 * Name: Megh Patel and Nirmal Patel
 * Title: Java lab 1
 * Student ID: 100802838 and 100830820
*/

import javax.xml.namespace.QName;
import java.util.Scanner;

public class console
{
    private console()
    {
        NUM_OF_PLAYERS = 3;
        NUM_OF_GAMES = 2;
        console = new Scanner(System.in);
    }

    private static console m_instance;

    public static console Instance()
    {
        if(m_instance == null)
        {
            m_instance = new console();
        }
        return m_instance;
    }

    public final int NUM_OF_PLAYERS;
    public final int NUM_OF_GAMES;

    private Scanner console;

    public <T> T getConsoleInputToArray(String prompt, T[] object)
    {
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "Double[]":
                return (T) ((Double)console.nextDouble());
            case "Integer[]":
                return (T) ((Integer)console.nextInt());
            case "Float[]":
                return (T) ((Float)console.nextFloat());
            default:
                return (T) console.nextLine();
        }
    }

    public <T> void displayArray(T[] array)
    {
        for (var element: array)
        {
            System.out.println(element);
        }
    }



    public <T> void DisplayReport(T[] array)
    {
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {

            }
        }
    }

}