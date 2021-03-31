package a8;

import javax.swing.*;
import java.awt.*;

public class driver {
    public static void main(String args [])
    {
        double [] input ={},dayTemp ={};
        String []  day = {};
        System.out.println("******Welcome What Today Feels Like*******\n\n\n");

                Temperature temp = new Temperature();

        for (int y=0; y <3 ; y++)
        {
            day[y] = JOptionPane.showInputDialog("Enter day\n\n");
            dayTemp[y] = Double.parseDouble(JOptionPane.showInputDialog("Enter d Temp\n\n"));
        }

        temp.setTemp(dayTemp);
        temp.setDay(day);
        temp.calculateFeel();

        for(int x =0; x < temp.getFeel().length ; x++)
        {
            JOptionPane.showMessageDialog((Component) null," The Temperature Feels Like: "+ temp.getFeel()[x]);
        }
    }
}
