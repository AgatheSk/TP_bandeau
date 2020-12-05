/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bandeau.Bandeau;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author agath
 */
public class EffetPenduMulti extends EffetNormal {

    private Color couleur;
    Random rand = new Random();

    
    public EffetPenduMulti(String msg, Bandeau b) {
        super(msg, b);
        this.duree = 1200;
        couleurAleatoire();
    }

    public EffetPenduMulti(String msg, int d, Bandeau b) {
        super(msg, d, b);
        couleurAleatoire();
    }

    public EffetPenduMulti(Bandeau b) {
        super(b);
        this.duree = 1200;
        this.message="Pendu multicolore";
        couleurAleatoire();
    }
    
    public void couleurAleatoire() {
        this.couleur = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
    }

    /**
     * Active l'effet pendu multicolore
     * Affiche de manière aléatoire les lettres
     */
    @Override
    public void activate() {
        //On remplace tout les caractères
        String hiddenMsg = this.message.replaceAll(".", "_");
        band.setForeground(this.couleur);
        band.setMessage(hiddenMsg);
        band.sleep(duree);
        int position = 0;
        //Cette chaîne contiendra tous les caractères déjà trouvés
        String finding = "";
       //tant que tous les caractères n'ont pas été découverts
        while (!(hiddenMsg.equals(message))) {
            // La position est comprise dans la longueur du message
            position = this.rand.nextInt(this.message.length());
            if (hiddenMsg.charAt(position) == '_') {
                finding += this.message.charAt(position);
                // On reprend le message, et on remplace tous les caractères qui ne sont pas connus par des -
                hiddenMsg = this.message.replaceAll("[^" + finding + "]", "_");
                this.couleurAleatoire();
                //On change la police en une couleur aléatoire
                band.setForeground(this.couleur);
                band.setMessage(hiddenMsg);
                band.sleep(duree);
            }
        }

    }

    @Override
    public void fin() {
        this.band.close();
    }

}
