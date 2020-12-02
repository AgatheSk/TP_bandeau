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
public class EffetRainbow implements Effet {
    
    private Bandeau band;
    private String message;
    private int duree;
    
    public EffetRainbow(String msg){
        this.message=msg;
        this.band=new Bandeau();
        duree = 250;
    }
    
    public EffetRainbow(String msg, int d){
        this.message=msg;
        this.band=new Bandeau();
        duree = d;
    }
    
    @Override
    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    /**
     * Active l'effet rainbow
     */
    @Override
    public void activate() {
        band.setMessage(message);
        band.setBackground(Color.black);
        band.setForeground(Color.red);
        band.sleep(duree);
        band.setForeground(Color.orange);
        band.sleep(duree);
        band.setForeground(Color.yellow);
        band.sleep(duree);
        band.setForeground(Color.green);
        band.sleep(duree);
        band.setForeground(Color.cyan);
        band.sleep(duree);
        band.setForeground(Color.blue);
        band.sleep(duree);
        band.setForeground(Color.MAGENTA);
        band.sleep(duree);
        band.setForeground(Color.BLACK);

    }
    @Override
    public void fin(){
        this.band.close();
    }

    @Override
    public void setMessage(String s) {
        this.message=s;
    }

    
}
