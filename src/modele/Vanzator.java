package modele;

public class Vanzator extends Angajat {
    private String zona;

    // constructor fara parametri
    public Vanzator() {
        super();
        this.zona = "nimic";
    }

    // constructor cu parametri
    public Vanzator(String nume, int id, int ore, String zona) {
        super(nume, id, ore);
        this.zona = zona;
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("el sta la zona de " + zona);
    }
}