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
public class EffetRainbow extends EffetNormal {

    public EffetRainbow(String msg, Bandeau b){
        super(msg,b);
        this.duree=250;
    }
    
    public EffetRainbow(String msg, int d, Bandeau b){
        super(msg, d,b);
    }
    
    public EffetRainbow(Bandeau b){
        super(b);
        this.duree=250;
        this.message="Rainbow";
    }
    
    
    /**
     * Active l'effet rainbow
     */
    @Override
    public void activate() {
        this.band.setMessage(message);
        band.setBackground(Color.black);
        changeCouleur(Color.red);
        changeCouleur(Color.orange);
        changeCouleur(Color.yellow);
        changeCouleur(Color.green);
        changeCouleur(Color.cyan);
        changeCouleur(Color.blue);
        changeCouleur(Color.MAGENTA);
        changeCouleur(Color.BLACK);
    }
    
    public void changeCouleur(Color c){
        band.setForeground(c);
       band.sleep(duree);
    }
    
    @Override
    public void fin() {
        this.band.close();
    }


    
}
