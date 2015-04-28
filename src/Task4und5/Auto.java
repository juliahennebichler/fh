
package Task4und5;

/**
 *
 * @author 1410653313
 */
public class Auto extends Fahrzeug implements Comparable <Auto> {
    
    
    private boolean klimaanlage;
    private short airgbags;
    
    public enum color{
        Silver, Red, Black, Blue, White;
    }
    
    private color farbeneu;
    

    public Auto(short reifen, color farbeneu, short ps, short tueren,short airbags) {

        super(reifen, ps, tueren);
        this.klimaanlage = false;
        this.airgbags = airbags;
        anzahl++;
    }
    
    public Auto(short reifen, short ps, short tueren,short airgbags) {
        this (reifen, color.Black, ps, tueren, airgbags);
        
    }
    
    

    public color getFarbeneu() {
        return farbeneu;
    }

    public void setFarbeneu(color farbeneu) {
        this.farbeneu = farbeneu;
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirgbags() {
        return airgbags;
    }

    public void setAirgbags(short airgbags) {
        this.airgbags = airgbags;
    }
    
    public void klimaanlageAn(){
     
        if (klimaanlage = false){
            klimaanlage = true;
        }
        else{
            System.out.println("Klimaanlage läuft bereits");
        }
    }
     public void klimaanlageAus(){
     
        if (klimaanlage = true){
            klimaanlage = false;
        }
        else{
            System.out.println("Klimaanlage bereits aus");
        }
        
        
        
    }

    @Override
    public String toString() {
        return "Mein Auto hat " +getPs()+ " PS und fährt mit " +getGeschwindigkeit()+ " km/h";
    }

    @Override
    public int compareTo(Auto o) {
    
    if (this.getPs() < o.getPs()) {
      return -1;
    }
    else if (this.getPs() > o.getPs()) {
      return 1;
    }
    else{
    
    return 0;
    }
    }

  
     
    
    
    
    
}
