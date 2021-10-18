/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;
import java.io.IOException;


/**
 *
 * @author axand
 */
public class ProjetTennis {
    

   
    public static void main(String[] args) throws IOException {
        
       int NbrJoueur = 128;
       int NbrArbitre = 10;
       
       String AdrFileJ="info-joueur.txt";
       String AdrFileA="info-arbitre.txt";
       
       Joueur.ListeJoueur(NbrJoueur, AdrFileJ );
       Arbitre.ListeArbitre(NbrArbitre, AdrFileA);
       
       Arbitre Axandre = new Arbitre();
       Axandre.nomNaissance = "gorgol";
       Axandre.faute();
    }
    
}
