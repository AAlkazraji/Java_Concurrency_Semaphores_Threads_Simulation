//Ahmed Al-khazraji
//c3277545@uon.edu.au
//23/09/2022


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.lang.Thread;
import java.util.concurrent.Semaphore;

public class Bridge
{
    Semaphore bridge = new Semaphore(1);
    int neon = 0;
    public Bridge(){}

    public Semaphore getBridge()
    {
        return bridge;
    }
    public int getNeon()
    {
        return neon;
    }

    public void setNeon()
    {
        neon++;
    }

}