package Controller;

import View.GUIAssignment1;

import javax.swing.*;

public class DisplayThread extends Thread
{
public boolean isDisplaying1 = false;

public JLabel label;
public GUIAssignment1 guiAssignment1;


public void run()
{
    while(true)
    {
        if(isDisplaying1 == true)
        {
            double x = Math.random() * 190;
            double y = Math.random() * 190;

            label.setLocation((int)x, (int)y);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        else{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

}
