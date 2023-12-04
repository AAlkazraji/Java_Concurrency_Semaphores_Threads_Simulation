//Ahmed Al-khazraji
//c3277545@uon.edu.au
//23/09/2022

import java.lang.String;
import java.lang.Thread;

public class Farmer implements Runnable
{
    private String farmerId;
    private boolean isSouth;
    Bridge bridge;


    public Farmer(String newId, Bridge b, boolean s)
    {
        farmerId = newId;
        isSouth = s;
        bridge = b;
    }

    public Farmer()
    {
        farmerId = " ";
        isSouth = true;
    }

    public void setFarmerId(String data)
    {
        farmerId = data;
    }

    public void setIsSouth(boolean data)
    {
        isSouth = data;
    }

    public String getFarmerId()
    {
        return farmerId;
    }


    public boolean getIsSouth()
    {
        return isSouth;
    }

    public void run()
    {
        while(bridge.getNeon() < 97)
        {
            try {
                bridge.getBridge().acquire();
                if (isSouth)
                {
                    System.out.println(farmerId + "waiting for the bridge: Going toward Nourth");
                    for (int i = 5; i < 20; i += 5)
                    {
                        System.out.println(farmerId + "crossing the bridge step"+ i);
                        Thread.sleep(200);
                    }
                    System.out.println(farmerId + "Acrossing the bridge");
                    isSouth = false;
                }
                else
                {
                    System.out.println(farmerId + "waiting for the bridge: Going toward South");
                    for (int i = 5; i < 20; i += 5)
                    {
                        System.out.println(farmerId + "crossing the bridge step"+ i);
                        Thread.sleep(20);
                    }
                    System.out.println(farmerId + "Acrossing the bridge");
                    isSouth = true;
                }
                bridge.setNeon();
                System.out.println("NEON " + bridge.getNeon());
                bridge.getBridge().release();
                Thread.sleep(20);
            }catch(Exception e){}
        }
    }
}