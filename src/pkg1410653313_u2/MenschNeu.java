
package pkg1410653313_u2;


public class MenschNeu {
    
    public MenschNeu(){};
    
    String vorname;
    String nachname;
    int alter;

    public MenschNeu(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public void Status (){
        
        System.out.println("Es handelt sich um einen Menschen: " +vorname+ " " +nachname+ " " + alter);
        
    }
    
}
