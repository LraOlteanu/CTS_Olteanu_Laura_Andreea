package sources.sem2;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;
    protected static int pragPunctaj = 80;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static int getPragPunctaj() {
        return pragPunctaj;
    }

    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public String[] getDenumireProiect() {
        return denumireProiect;
    }

    public void setDenumireProiect(String[] denumireProiect) {
        this.denumireProiect = denumireProiect;
    }

    public void afiseazaStatut() {
        if (punctaj > pragPunctaj)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nr_proiecte;
    }

    public void setDenumiriProiecte(int nr_proiecte, String[] denumireProiecte) {

        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = new String[nr_proiecte];
        for (int i=0; i < nr_proiecte; i++) {
            this.denumireProiect[i] = denumireProiecte[i];
        }
    }

    public void afisareReturnareSalariuZilnic(int salariu) {
        // TODO Auto-generated method stub
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + salariu + " Euro/zi in proiect.");
    }
}