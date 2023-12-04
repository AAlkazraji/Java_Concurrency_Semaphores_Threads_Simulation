//Ahmed Al-khazraji
//c3277545@uon.edu.au
//23/09/2022


import java.io.File;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;


public class P1
{
    public static void main (String[] args)
    {

        String dataFile = args[0];
        String input;
        Bridge bridge = new Bridge();
        int s = 0, n = 0;
        ArrayList<Thread> N_farmer = new ArrayList<Thread>();
        ArrayList<Thread> S_farmer = new ArrayList<Thread>();

        File file = new File(dataFile);
        try
        {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
            {
                n = Character.getNumericValue(scanner.next().charAt(2));
                s = Character.getNumericValue(scanner.next().charAt(2));
            }

            for (int i = 0; i < n; i++)
            {
                Farmer nFarm = new Farmer("N_farmer" + (i+1) + " ", bridge, false);
                N_farmer.add(new Thread(nFarm));
            }

            for (int j = 0; j < s; j++)
            {
                Farmer sFarm = new Farmer("S_farmer" + (j+1) + " ", bridge, true);
                S_farmer.add(new Thread(sFarm));
            }

        }
        catch (Exception e)
        {
            System.out.println("an error occurred while taking inputs");
        }

        for (int p = 0; p < N_farmer.size(); p++)
        {
            N_farmer.get(p).start();

        }
        for (int d = 0; d < S_farmer.size(); d++)
        {
            S_farmer.get(d).start();
        }

    }

}
