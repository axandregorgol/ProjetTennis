/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;
import java.io.*;
import projettennis.Personne;
import projettennis.Spectateur;
import projettennis.Joueur;
import projettennis.Arbitre;
import projettennis.Tournoi;
/**
 *
 * @author iPraz
 */
public class ProjetTennis {
    

   
    public static void main(String[] args) throws IOException {
       int NbrJoueur = 128;
       
       String AdrFile="info-joueur.txt";
       
       Tournoi.ListeJoueur(NbrJoueur, AdrFile);
        
       Arbitre Axandre = new Arbitre();
       Axandre.nomNaissance = "gorgol";
       Axandre.faute();
    }
    
}
