package modele;
import java.util.ArrayList;

public class Angajat {
    private String nume;
    private int id;
    private int oreSaptamana;
    private ArrayList<Tura> ture; // lista cu turele omului

    // constructor gol
    public Angajat() {
        this.nume = "anonim";
        this.id = 0;
        this.oreSaptamana = 0;
        this.ture = new ArrayList<Tura>();
    }

    // constructor plin
    public Angajat(String nume, int id, int ore) {
        this.nume = nume;
        this.id = id;
        this.oreSaptamana = ore;
        this.ture = new ArrayList<Tura>();
    }

    // afiseaza informatii
    public void afisare() {
        System.out.println("angajatul " + nume + " are id " + id + " si lucreaza " + oreSaptamana + " ore");
    }

    // anunta cand e liber
    public void puneDisponibil() {
        System.out.println(nume + " a introdus zilele cand poate lucra");
    }
    
    // ii da o tura
    public void daTura(Tura t) {
        ture.add(t);
        t.bifeazaAcoperita(true);
    }

    public String getNume() { 
        return nume; 
    }
}