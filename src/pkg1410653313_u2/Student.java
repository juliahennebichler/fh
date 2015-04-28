/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1410653313_u2;

/**
 *
 * @author Julia
 */
public class Student extends MenschNeu {
    
    String matrikelnummer;
    String studiengang;

    public Student(String matrikelnummer, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    
    @Override
    public void Status (){
         System.out.println("Es handelt sich um einen Studenten: " + vorname + " " + nachname + " " + alter + " " + matrikelnummer + " " + studiengang);
    }
    
    
}
