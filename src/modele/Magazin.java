package modele;
import java.util.ArrayList;

public class Magazin {
    private String denumire;
    private String locatie;
    private ArrayList<Angajat> oameni; // compozitia ceruta

    // constructor de baza
    public Magazin() {
        this.denumire = "magazin";
        this.locatie = "strada";
        this.oameni = new ArrayList<Angajat>();
    }

    // constructor bun
    public Magazin(String nume, String loc) {
        this.denumire = nume;
        this.locatie = loc;
        this.oameni = new ArrayList<Angajat>();
    }

    // adauga om nou
    public void adaugaAngajat(Angajat a) {
        oameni.add(a);
        System.out.println(a.getNume() + " lucreaza acum la " + denumire);
    }

    // parcurge lista
    public void afiseazaTot() {
        System.out.println("lista personal " + denumire);
        for(int i = 0; i < oameni.size(); i++) {
            oameni.get(i).afisare();
        }
    }
}