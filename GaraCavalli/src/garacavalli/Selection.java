/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garacavalli;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Alessandro
 */
public class Selection implements ActionListener {

    private JFrame frame = new JFrame();
    private JPanel pannello = new JPanel();

    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton b10 = new JButton("10");
    private JLabel titolo = new JLabel("Benvenuto al gioco dei Cavalli!");
    private JLabel descrizione = new JLabel("Scegli il numero di corsie dei cavalli!");

    public Selection() {  //pannello iniziale
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //centro il frame nel mezzo dello schermo
        pannello.setSize(600, 400);
        pannello.setBackground(Color.WHITE);
        pannello.setLayout(null);
        frame.add(pannello);

        titolo.setBounds(200, 20, 200, 40);

        descrizione.setBounds(180, 60, 400, 40);

        b2.addActionListener(this);
        b2.setBounds(50, 180, 100, 40);

        b3.addActionListener(this);
        b3.setBounds(170, 180, 100, 40);

        b4.addActionListener(this);
        b4.setBounds(290, 180, 100, 40);

        b5.addActionListener(this);
        b5.setBounds(410, 180, 100, 40);

        b6.addActionListener(this);
        b6.setBounds(50, 240, 100, 40);

        b7.addActionListener(this);
        b7.setBounds(170, 240, 100, 40);

        b8.addActionListener(this);
        b8.setBounds(290, 240, 100, 40);

        b9.addActionListener(this);
        b9.setBounds(410, 240, 100, 40);

        b10.addActionListener(this);
        b10.setBounds(235, 300, 100, 40);

        pannello.add(b2);
        pannello.add(b3);
        pannello.add(b4);
        pannello.add(b5);
        pannello.add(b6);
        pannello.add(b7);
        pannello.add(b8);
        pannello.add(b9);
        pannello.add(b10);
        pannello.add(titolo);
        pannello.add(descrizione);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b2)) {
            GaraCavalli.numCav = 2;  //qui vado a modificare la variabile numCav, che determina il num di corsie
            GaraCavalli m = new GaraCavalli();
        }
        else
            if(e.getSource().equals(b3)){
                GaraCavalli.numCav = 3;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b4)){
                GaraCavalli.numCav = 4;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b5)){
                GaraCavalli.numCav = 5;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b6)){
                GaraCavalli.numCav = 6;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b7)){
                GaraCavalli.numCav = 7;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b8)){
                GaraCavalli.numCav = 8;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b9)){
                GaraCavalli.numCav = 9;
                GaraCavalli m = new GaraCavalli();
            }
        else
            if(e.getSource().equals(b10)){
                GaraCavalli.numCav = 10;
                GaraCavalli m = new GaraCavalli();
            }
    }
}
