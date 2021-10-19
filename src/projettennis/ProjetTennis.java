/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;
import java.io.IOException;
import projettennis.Joueur;


/**
 *
 * @author axand
 */
public class ProjetTennis {
    
    public static void main(String[] args) throws IOException {
        
       
       int NbrArbitre = 10;
       int NbrJoueur = 6;
       String AdrFileJ="info-joueur.txt";
       String AdrFileA="info-arbitre.txt";
               
       Joueur[] Player = new Joueur[NbrJoueur+1];     //<-- NOMBRE DE JOUEUR+1
       String [] TabQualif= new String[NbrJoueur];    // creation tableau pour nom des qualifiés
         
       Arbitre.ListeArbitre(NbrArbitre, AdrFileA);           //Récupération info arbitre + creation tableau arbitre
       Player = Joueur.ListeJoueur(AdrFileJ, Player);  //Récupération info Joueur + creation tableau Joueur (=Player[])
       
       TabQualif = Tournoi.ListeQualif(Player, TabQualif, NbrJoueur);       //Création Tableau des joueurs qualifiés à partir du tableau des joueurs + du parametre qualification
       Tournoi.AffichageQualif(TabQualif, NbrJoueur);                       // Affichage des joueurs qualifiés
       Tournoi.CompoMatch(TabQualif);                                   // Affiche les matchs (joueur(i)vsjoueur(i+1) avec i place du classement);
       
    }
    
}
