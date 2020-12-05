/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bandeau.Bandeau;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author agath
 */
public class Scenario {

    public Map<String, EffetNormal> mesEffets = new HashMap<>();
    public Bandeau band = new Bandeau();

    public static void main(String[] args) {
        Scenario sc = new Scenario();
        sc.createScenario();

    }
    
    public void createScenario(){
        this.allEffects();
        this.mesEffets.get("normal").setDuree(2000);
        this.mesEffets.get("normal").setMessage("Présentation effet zoom-dezoom");
        this.mesEffets.get("normal").activate();
        this.mesEffets.get("normal").setDuree(1000);
        this.mesEffets.get("zoomdezoom").activate();
        
        this.mesEffets.get("normal").setMessage("Présentation effet arc-en-ciel");
        this.mesEffets.get("normal").activate();
        this.mesEffets.get("normal").setDuree(1000);
        this.mesEffets.get("rainbow").activateRepeat(1);


        this.mesEffets.get("normal").setMessage("Effet backflip");
        this.mesEffets.get("normal").activate();
               this.mesEffets.get("flip").activate();

        this.mesEffets.get("normal").setMessage("Effet pendu colorisé");
        this.mesEffets.get("normal").activate();
        this.mesEffets.get("penduCouleur").activate();
        
        this.mesEffets.get("normal").fin();
    }

    public void ajoutEffet(String name, EffetNormal e) {
        this.mesEffets.put(name, e);
    }

    public void allEffects() {
        this.ajoutEffet("rainbow", new EffetRainbow("Arc-en-ciel !",250, this.band));
        this.ajoutEffet("normal", new EffetNormal("", this.band));
        this.ajoutEffet("flip", new EffetBackFlip("Youpiii", this.band));
        this.ajoutEffet("penduCouleur", new EffetPenduMulti("Bazooka", this.band));
        this.ajoutEffet("zoomdezoom", new EffetZoomDezoom("Grand puis petit", band));
    }
}
