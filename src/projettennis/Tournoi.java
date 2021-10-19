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
 * @author axand
 */
public class Tournoi {
    
    String lieu;
    String surface;
    int etape;
    
    
    
    
    public static String [] ListeQualif(Joueur Player[], String TabQualif[], int NbrJoueur){
        int i=0;
                for (int k=0; k<NbrJoueur; k++){                  
            if (Player[k].qualification.equals("qualifie")){
                TabQualif[i]=Player[k].prenom;
                i++;
               
            }
            
        }
                return TabQualif;
    }
    
    
    
    
    
    public static void AffichageQualif(String TabQualif[], int NbrJoueur){
        for (int i=0; i<NbrJoueur; i++){
           System.out.println("Joueur numero "+(i+1)+" qualifié = "+ TabQualif[i]);
       }
        System.out.println("\n");
    }
    
    
    
    
    
    
    
       public static void CompoMatch(String TabQualif[]){
       int a;
       a=TabQualif.length;
       int n=1;
        for (int i=0; i<a-1;i++){
            System.out.println("Match"+n+" :"+TabQualif[i]+" VS "+TabQualif[i+1]);
            n++;i++;
        }
   }
    
}
    

