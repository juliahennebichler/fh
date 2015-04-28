
package Task4und5;

import Task4und5.Auto.color;
import java.util.ArrayList;
import java.util.Collections;




public class Aufrufe {

    
    public static void main(String[] args) {
        
        Auto bmw = new Auto ((short)4,color.Black, (short)220, (short)5, (short)4);
        Auto audi = new Auto ((short)4, color.Blue, (short)180, (short)5, (short)8);
        Auto ford = new Auto ((short)4, color.Red, (short)100, (short)5, (short)4);
        Auto honda = new Auto ((short)4, color.Silver, (short)230, (short)5, (short)4);
        Auto mazda = new Auto ((short)4, color.White, (short)140, (short)5, (short)8);
        
        ArrayList <Auto> liste = new ArrayList <>();
        liste.add(bmw);
        liste.add(audi);
        liste.add(ford);
        liste.add(honda);
        liste.add(mazda);
        
        Collections.sort(liste);
        
        for (Auto x: liste){
            System.out.println(x.toString());
        }

        
        
        
      
        
    }
    
}
