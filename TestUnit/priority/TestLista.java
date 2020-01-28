package priority;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLista {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void testInsert() {
        System.out.println("insert");
        Pacient pacient = null;
        Fila instance = new Fila();
        boolean expResult = true;
        boolean result = instance.insert(pacient);
        assertEquals(expResult, result);
      
    }

    
    @Test
    public void testLista5() {
        System.out.println("lista5");
        Fila instance = new Fila();
        ArrayList<Pacient> expResult = new ArrayList<Pacient>();
        
        Pacient P1 = new Pacient("Maria", 25, "Verde", 1);
        	instance.insert(P1);
        	expResult.add(P1);
        Pacient P2 = new Pacient("Marcio", 30, "Verde", 1);
        	instance.insert(P2);
        	expResult.add(P2);
        Pacient P3  = new Pacient("Geraldo", 21, "Vermelho", 3);
        	instance.insert(P3);
        	expResult.add(P3);
        Pacient P4  = new Pacient("Andressa", 22, "Amarelo", 2);
        	instance.insert(P4);
        	expResult.add(P4);
        Pacient P5  = new Pacient("Julio", 70, "Vermelho", 3);
        	instance.insert(P5);
        	expResult.add(P5);
        
       
        Collections.sort(expResult);
        
        ArrayList<Pacient> result = instance.lista5();
        assertEquals(expResult, result);
        
    }
    
}
