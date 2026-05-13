package teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import modele.Manager;

public class TesteAlocare {
    
    @Test
    public void testOreLegale() {
        Manager m = new Manager();
        
        // set de date 1: caz normal (30 + 8 = 38). asteptam true
        assertEquals(true, m.acceptaTuraLimita(30, 8));
        
        // set de date 2: fix pe limita (32 + 8 = 40). asteptam true
        assertEquals(true, m.acceptaTuraLimita(32, 8));
        
        // set de date 3: depaseste limita (35 + 8 = 43). asteptam false
        assertEquals(false, m.acceptaTuraLimita(35, 8));
        
        // set de date 4: date invalide, cu minus. asteptam false
        assertEquals(false, m.acceptaTuraLimita(-5, 8));
    }
}