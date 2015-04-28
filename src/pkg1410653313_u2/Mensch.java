
package pkg1410653313_u2;


public class Mensch extends Saeugetier {

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
   
    public String printAll(){
        return name + " # " + alter + " # " + geschlecht;
    }
   
    
    
}
