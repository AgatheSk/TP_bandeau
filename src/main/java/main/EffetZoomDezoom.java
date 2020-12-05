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
public class EffetZoomDezoom extends EffetNormal {
        public EffetZoomDezoom(String msg, Bandeau b) {
        super(msg, b);
        this.duree = 100;
    }

    public EffetZoomDezoom(String msg, int d, Bandeau b) {
        super(msg, d, b);
    }

    public EffetZoomDezoom(Bandeau b) {
        super(b);
        this.duree = 100;
        this.message="Zoom Dezoom";
    }
    
    /**
     * Active l'effet zoom dezoom
     * Affiche une écriture en taille normal, puis en taille grande, puis en taille petite 
     */
    @Override
    public void activate() {
        EffetNormal eN= new EffetNormal(message, band);
        eN.activate();
        Font police = band.getFont();
        for(int i=0; i<6; i++){
            police=police.deriveFont(police.getStyle(), police.getSize()+5);
            band.setFont(police);
            band.setMessage(message);
            band.sleep(duree);
        }
        band.setBackground(Color.BLACK);
        band.setForeground(Color.white);
        for(int i=0; i<7; i++){
            police=police.deriveFont(police.getStyle(), police.getSize()-5);
            band.setFont(police);
            band.setMessage(message);
            band.sleep(dureethi);
        }
        band.sleep(duree+100);
    }

    @Override
    public void fin() {
        this.band.close();
    }
    
}
