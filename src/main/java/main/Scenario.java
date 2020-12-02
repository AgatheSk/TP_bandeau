/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

/**
 *
 * @author agath
 */
public class Scenario {
    
    public Map<String, Effet> mesEffets = new HashMap<>();
    
    public static void main(String[] args) {
        Scenario sc= new Scenario();
        //Scanner clavier = new Scanner(System.in);
        //System.out.print("Entrez le message à afficher en arc-en-ciel : ");
        //String msg = clavier.nextLine();
        //EffetRainbow e =new EffetRainbow("Arc-en-ciel !");
        sc.ajoutEffet("rainbow", new EffetRainbow("Arc-en-ciel !"));
        sc.mesEffets.get("rainbow").activate();
        System.out.print("Répétition plus longue");
        sc.mesEffets.get("rainbow").setDuree(500);
        sc.mesEffets.get("rainbow").activate();
        sc.mesEffets.get("rainbow").fin();
    }
    
    public void ajoutEffet(String name, Effet e){
        this.mesEffets.put(name, e);
    }
}
