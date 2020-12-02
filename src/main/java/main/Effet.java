/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author agath
 */
public class Effet {

    public Bandeau band;
    
    public Effet(){
        this.band=new Bandeau();
    }

    public void RainbowBlackBackground(String msg) {
        band.setMessage(msg);
        band.setBackground(Color.black);
        band.setForeground(Color.red);
        band.sleep(250);
        band.setForeground(Color.orange);
        band.sleep(250);
        band.setForeground(Color.yellow);
        band.sleep(250);
        band.setForeground(Color.green);
        band.sleep(250);
        band.setForeground(Color.cyan);
        band.sleep(250);
        band.setForeground(Color.blue);
        band.sleep(250);
        band.setForeground(Color.MAGENTA);
        band.sleep(250);
        band.setForeground(Color.BLACK);

    }
}
