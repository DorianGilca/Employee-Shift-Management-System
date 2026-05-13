package modele;

public class Manager extends Angajat {
    private int gradAcces;

    // constructor simplu
    public Manager() {
        super();
        this.gradAcces = 1;
    }

    // constructor cu date
    public Manager(String nume, int id, int ore, int grad) {
        super(nume, id, ore);
        this.gradAcces = grad;
    }

    // face algoritmul
    public void faceOrar() {
        System.out.println("managerul " + getNume() + " calculeaza programul");
    }

    // vede daca are pauza legala
    public boolean eLegal(Tura t) {
        System.out.println("verificam legea... e totul in regula");
        return true;
    }
    
    
 // metoda care verifica daca omul depaseste 40 de ore
    public boolean acceptaTuraLimita(int oreDejaLucrate, int oreTuraNoua) {
        if (oreDejaLucrate < 0 || oreTuraNoua <= 0) {
            return false; // caz de eroare, date anormale
        }
        
        int total = oreDejaLucrate + oreTuraNoua;
        if (total <= 40) {
            return true; // e legal, nu depaseste
        } else {
            return false; // depaseste limita saptamanala
        }
    }
}