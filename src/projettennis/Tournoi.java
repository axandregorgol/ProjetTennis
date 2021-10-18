/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;
import java.io.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author iPraz
 */
public class Tournoi {
    
    public static void ListeJoueur(int NbrJoueur, String AdrFile) throws FileNotFoundException, IOException{
      
    
    File file = new File(AdrFile);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    StringBuffer sb = new StringBuffer();
    String line;
    while((line = br.readLine()) != null){
        
        sb.append(line);
        sb.append("\n");
        
    }
    fr.close();
        System.out.println(sb.toString());
   
        Joueur[] Player = new Joueur[NbrJoueur];       
        
        for (int i=1; i<=NbrJoueur; i++){
             Player[i-1] = new Joueur();
             
             
             /*
             Player[i-1].bras=
             Player[i-1].entraineur=
             Player[i-1].nomNaissance=
             Player[i-1].sponsor=
             Player[i-1].nationalite=
             Player[i-1].nomCourant=
             Player[i-1].poids=
             Player[i-1].taille=    
             Player[i-1].prenom=
             Player[i-1].classement=i-1;
             Player[i-1].surnom=
*/
        }
        
    }
    
}
