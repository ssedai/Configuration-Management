/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagun
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Ninety_Nine_Bottles_of_Beer();
    }
    
    
    public static void Ninety_Nine_Bottles_of_Beer()
    {
        
        for (int i=99; i>0; i--)
        {
         
        if (i==1)
        {
        System.out.println(i + " bottle of beer on the wall, " + i+ " bottle of beer ");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
        }
        
        else if(i==2)
        {
        System.out.println( i+" bottles of beer on the wall, "+ i+" bottles of beer");
        System.out.println("take one down, pass it around, " + (i-1)+ " bottle of beer on the wall. ");
            
        }
            
        else if(i>3)
        {
        System.out.println( i+" bottles of beer on the wall, "+ i+" bottles of beer");
        System.out.println("take one down, pass it around, " + (i-1)+ " bottles of beer on the wall. "); 
        }

        }
        
       }
    
}


