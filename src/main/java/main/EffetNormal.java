/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author agath
 */
public class EffetNormal {

    Bandeau band;
    String message;
    int duree;
    
    public EffetNormal(String msg, Bandeau b) {
        this.message = msg;
        this.band = b;
        this.duree=1000;
    }

    public EffetNormal(String msg, int d, Bandeau b) {
        this.message = msg;
        this.band = b;
        duree = d;
    }
    
    public EffetNormal(Bandeau b) {
        this.message = "Message par défaut";
        this.band = b;
        duree = 1000;
    }

    public void activate() {
        band.setMessage(message);
        this.band.setForeground(Color.BLACK);
        this.band.setFont(new Font("Sans Serif",Font.PLAIN,  20));
        this.band.setRotation(0);
        band.setBackground(Color.white);
        band.setMessage(message);
        band.sleep(duree);
    }
    
    /**
     * Active l'effet et le repète un nombre repetition de fois
     * @param repetition 
     */
    public void activateRepeat(int repetition){
        this.activate();
        EffetNormal eN= new EffetNormal(band);
        if(repetition>=1){
            for (int i=1; i<=repetition; i++){
                eN.setMessage("Répetition plus lente "+i);
                eN.activate();
                band.sleep((int) (duree*1.5));
                this.activate();
            }
        }
    }

    public void fin() {
        this.setMessage("The end");
        this.setDuree(3000);
        this.activate();
        this.band.close();
    }

    public void setDuree(int d) {
        this.duree = d;
    }

    public void setMessage(String s) {
        this.message = s;
    }

}
