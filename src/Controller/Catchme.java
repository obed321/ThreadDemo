package Controller;


import View.GUIAssignment1;

import javax.swing.*;

public class Catchme extends Thread
{

public boolean isPlaying = false;


    public JLabel label;
    public GUIAssignment1 guiAssignment1;

    @Override
    public void run() {

        while(true)
        {

            if(isPlaying == true)
            {
                double x = Math.random() * 250;
                double y = Math.random() * 280;

                label.setLocation((int)x, (int)y);
                try {
                    Thread.sleep(2000);
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
