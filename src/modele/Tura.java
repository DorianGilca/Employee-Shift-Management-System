package modele;

public class Tura {
    private int ziua;
    private int oraStart;
    private int oraGata;
    private boolean eOcupata;

    // constructor default
    public Tura() {
        this.ziua = 1;
        this.oraStart = 8;
        this.oraGata = 16;
        this.eOcupata = false;
    }

    // constructor custom
    public Tura(int ziua, int start, int gata) {
        this.ziua = ziua;
        this.oraStart = start;
        this.oraGata = gata;
        this.eOcupata = false;
    }

    // marcheaza tura luata
    public void bifeazaAcoperita(boolean status) { 
        this.eOcupata = status; 
    }
    
    public boolean esteOcupata() { 
        return eOcupata; 
    }
}