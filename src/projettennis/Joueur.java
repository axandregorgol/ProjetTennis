/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author axand
 */
public class Joueur extends Personne{
    
        public String bras;
        public String entraineur;
        public String sponsor;
        public String classement;
        
        public static void ListeJoueur(int NbrJoueur, String AdrFile) throws FileNotFoundException, IOException{
              
            File file = new File(AdrFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            int l=1;
            int j=1;

            Joueur[] Player = new Joueur[NbrJoueur+1];     //<-- NOMBRE DE JOUEUR+1

            while((line = br.readLine()) != null){

                if (line.equals(";")){

                    l=0;
                    j=j+1;

                }
                Player[j-1] = new Joueur();
                 switch(l){

                    case 1 : Player[j-1].bras=line; System.out.println(line); break;
                    case 2 : Player[j-1].prenom=line; System.out.println(line); break;
                    case 3 : Player[j-1].entraineur=line; System.out.println(line);System.out.println("on passe au joueur d'apres");break;
                  /*case 4 : Player[j-1].nomNaissance= ;
                    case 5 : Player[j-1].sponsor= ;
                    case 6 : Player[j-1].nationalite= ;
                    case 7 : Player[j-1].nomCourant= ;
                    case 8 : Player[j-1].poids= ;
                    case 9 : Player[j-1].taille=    ;
                    case 10 :Player[j-1].classement=i-1;
                    case 11 :Player[j-1].surnom= ;
                                                                      */
                }

                l=l+1;

              }
            fr.close();
        }
    }
