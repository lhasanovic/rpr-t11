package main.java;
import main.java.Grad;

public class Drzava {
    private int id;
    private String naziv;
    private Grad glavni_grad;

    public Drzava(int id, String naziv, Grad glavni_grad) {
        this.id = id;
        this.naziv = naziv;
        this.glavni_grad = glavni_grad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Drzava() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Grad getGlavniGrad() {
        return glavni_grad;
    }

    public void setGlavniGrad(Grad glavni_grad) {
        this.glavni_grad = glavni_grad;
    }

    @Override
    public String toString() {
        return "main.java.Drzava{" + "naziv=" + naziv + ", glavni_grad=" + glavni_grad.getNaziv() + '}';
    }


}
