/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author agath
 */
public class EffetBackFlip extends EffetNormal {

    public EffetBackFlip(String msg, Bandeau b) {
        super(msg, b);
        this.duree = 300;
    }

    public EffetBackFlip(String msg, int d, Bandeau b) {
        super(msg, d, b);
    }
    
    public EffetBackFlip(Bandeau b) {
        super(b);
        this.duree = 300;
        this.message="Back-flip";
    }

    @Override
    public void activate() {
        band.setMessage(message);
        band.setFont(new Font("Times New Roman", Font.BOLD, 25));
        band.setRotation(45);
        band.sleep(duree);
        band.setRotation(90);
        band.sleep(duree);
        band.sleep(duree);
        band.setRotation(135);
        band.setRotation(180);
        band.sleep(duree);
        band.setRotation(225);
        band.sleep(duree);
        band.setRotation(270);
        band.sleep(duree);
        band.setRotation(0);
        band.sleep(duree);
    }

    @Override
    public void fin() {
        this.band.close();
    }

}
