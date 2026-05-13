package modele;

public class Main {
    public static void main(String[] args) {
        // facem un magazin
        Magazin mag = new Magazin("mega", "centru");

        // bagam niste angajati
        Manager sef = new Manager("ion", 1, 40, 5);
        Vanzator v1 = new Vanzator("vasile", 2, 20, "lactate");
        Vanzator v2 = new Vanzator("maria", 3, 30, "paine");

        // ii punem in sistem
        mag.adaugaAngajat(sef);
        mag.adaugaAngajat(v1);
        mag.adaugaAngajat(v2);

        System.out.println();
        // vedem lista pe ecran
        mag.afiseazaTot();
        System.out.println();

        // facem o tura luni
        Tura t1 = new Tura(1, 8, 16);
        
        // apelam metodele
        sef.puneDisponibil();
        sef.faceOrar();
        
        // alocam omul
        if(sef.eLegal(t1)) {
            v1.daTura(t1);
            System.out.println("am pus tura pentru " + v1.getNume());
        }
    }
}