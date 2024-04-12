package Guardarropas;

import Guardarropas.Validaciones.RestriccionAtuendo;

import java.util.List;

public class ConfiguracionAtuendo {

    private final List<CategoriaPrenda> categoriaPrendas;

    public ConfiguracionAtuendo(List<CategoriaPrenda> categoriaPrendas) {
        this.categoriaPrendas = categoriaPrendas;
    }


    public void validarPrenda(Prenda prenda) throws IllegalArgumentException {
        RestriccionAtuendo restriccionAtuendo = new RestriccionAtuendo();
        restriccionAtuendo.validar(prenda, this.categoriaPrendas);
    }

}
