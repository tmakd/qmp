package Guardarropas.Validaciones;

import Guardarropas.CategoriaPrenda;
import Guardarropas.Prenda;

import java.util.List;

public class RestriccionAtuendo {

    public void validar(Prenda prenda, List<CategoriaPrenda> categoriasConfiguracion) throws IllegalArgumentException {
        // Validar que la categoria de la prenda este contemplada en la configuracion del atuendo.
        CategoriaPrenda categoriaPrenda = prenda.getTipoPrenda().getCategoria();
        if (! categoriasConfiguracion.contains(categoriaPrenda)) {
            throw new IllegalArgumentException("La categoría de la prenda no está permitida en la configuración del atuendo.");
        }
    }
}
