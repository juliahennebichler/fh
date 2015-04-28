

package Task4und5;


public class Fahrzeug {
    
    public Fahrzeug (){}
    
    private short reifen;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;


    public Fahrzeug(short reifen, short ps, short tueren) {
        this.reifen = reifen;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = 0;
        anzahl++;
    }
    
    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
    
    public void starten (){
        gestartet = true; 
    }
    
    public void stoppen (){
        gestartet = false;
    }
    
    public void beschleunigen (short g){
       if (gestartet = true){
           if (geschwindigkeit +g <= 250){
                geschwindigkeit += g;
           }
       }
    }
    
    public void bremsen (short g){
        
        if (gestartet = true){
            if (geschwindigkeit-g >= 0){
                geschwindigkeit -=g; 
            }
            
        }
    }
    
   
    
}
