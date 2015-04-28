
package pkg1410653313_u2;


public abstract class Saeugetier {
    
    public Saeugetier(){};
    
    String name;
    int alter;
    String geschlecht;

    public Saeugetier(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    
    public abstract String printAll(); //abstrakte methode hat keinen methodenkörper
    
}
