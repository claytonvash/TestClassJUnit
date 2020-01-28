package priority;

import java.util.ArrayList;
import java.util.Collections;

public class Fila {
    
    private ArrayList<Pacient> lista = new ArrayList<Pacient>();
    private ArrayList<Pacient> fila = new ArrayList<Pacient>();
    
    public boolean insert(Pacient pacient){
        return lista.add(pacient);
    }
    public ArrayList<Pacient> lista5(){
        
        Collections.sort(lista);
        for(int x=0;x<5;x++){
            fila.add(lista.get(x));
           
        }
        return fila;
    }
    
}
