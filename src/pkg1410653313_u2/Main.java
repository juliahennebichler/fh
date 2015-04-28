/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1410653313_u2;


public class Main {

    public static void main (String[] args){
        //AUFGABE 2
        
        Mensch m1 = new Mensch ("Julia", 21, "weiblich");
        
         System.out.println(m1.printAll());
         
         
         //AUFGABE 3
         
         MenschNeu Julia = new MenschNeu ("Julia", "Hennebichler", 21);
         Julia.Status();
         
         Julia = new Student ("1410653313", "Web", "Julia", "Hennebichler", 21);
         Julia.Status();
    }
    
}
