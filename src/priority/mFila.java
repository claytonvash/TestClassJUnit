package priority;

public class mFila {

	public static void main(String[] args) {
        
        
     Fila fila = new Fila();
                
        Pacient P1 = new Pacient("Maria", 25, "Verde", 1);
                fila.insert(P1);
		Pacient P2 = new Pacient("Marcio", 30, "Verde", 1);
                fila.insert(P2);
		Pacient P3  = new Pacient("Geraldo", 21, "Vermelho", 3);
                fila.insert(P3);
		Pacient P4  = new Pacient("Andressa", 22, "Amarelo", 2);
                fila.insert(P4);
		Pacient P5  = new Pacient("Julio", 70, "Vermelho", 3);
                fila.insert(P5);
	
               
                System.out.println(" lista : "+fila.lista5());
        
    }
    
}
