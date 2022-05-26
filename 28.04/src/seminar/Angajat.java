package seminar;

import java.util.List;

public class Angajat implements iAngajat{
    String nume;
    int codAngajat;
    int salariu;
    List<Angajat> listaSubordonati;

    public Angajat() {
    }

    public Angajat(String nume, int codAngajat, int salariu, List<Angajat> listaSubordonati) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.listaSubordonati = listaSubordonati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCodAngajat() {
        return codAngajat;
    }

    public void setCodAngajat(int codAngajat) {
        this.codAngajat = codAngajat;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public List<Angajat> getListaSubordonati() {
        return listaSubordonati;
    }

    public void setListaSubordonati(List<Angajat> listaSubordonati) {
        this.listaSubordonati = listaSubordonati;
    }

    public void printDetalii()
    {
        System.out.println(this.codAngajat);
        System.out.println(this.nume);
        System.out.println(this.salariu);
    }
    public void addSubord(Angajat a)
    {
        this.listaSubordonati.add(a);
    }

    public void delSubord(iAngajat a)
    {
        this.listaSubordonati.remove(a);
    }
}
