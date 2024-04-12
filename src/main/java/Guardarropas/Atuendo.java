package Guardarropas;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    private List<Prenda> prendas;
    private ConfiguracionAtuendo configuracionAtuendo;

    public Atuendo(ConfiguracionAtuendo configuracionAtuendo) {
        this.configuracionAtuendo = configuracionAtuendo;
        this.prendas = new ArrayList<>();
    }

    public void agregarPrenda(Prenda prenda) {
        this.configuracionAtuendo.validarPrenda(prenda);
        prendas.add(prenda);
    }




    public List<Prenda> getPrendas() {
        return prendas;
    }
}