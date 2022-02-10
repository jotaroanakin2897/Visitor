package com.Grapich;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FinestraConBottone {

    Container contenuto=null;

    public FinestraConBottone()
    {
        JFrame finestra=new JFrame("ESEMPIO CON I LISTNER");
        finestra.setBounds(500,500,180,200);
        contenuto=finestra.getContentPane();
        contenuto.setLayout(new BoxLayout(contenuto,BoxLayout.Y_AXIS));

        JButton b1 = new JButton("Bottone 1");
        contenuto.add(b1);

        b1.addActionListener((ActionListener) new clicBottone());
        finestra.setVisible(true);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class clicBottone {
        public void actionPerformed(ActiveEvent evento)
        {
            contenuto.setBackground(Color.cyan);
        }

    }
}

