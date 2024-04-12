package Guardarropas;

import java.util.ArrayList;

public class Guardarropas {

    ArrayList<Prenda> prendas;

    public Guardarropas() {
        this.prendas = new ArrayList<>();
    }

    public Guardarropas(ArrayList<Prenda> prendas) {
        this.prendas = prendas;
    }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }
}
