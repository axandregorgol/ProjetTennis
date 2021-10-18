/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;

/**
 *
 * @author iPraz
 */
public class Arbitre extends Personne
{
    public void score(int scoreUN, int scoreDEUX){                  
            System.out.println("Le score est de"+scoreUN+"-"+scoreDEUX);
        }
        
        public void faute(){
            System.out.println("dire faute");
        }
}
