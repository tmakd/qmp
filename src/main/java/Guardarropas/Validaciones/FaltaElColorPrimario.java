package Guardarropas.Validaciones;

import Guardarropas.Prenda;

public class FaltaElColorPrimario implements EstrategiaValidacionPrenda {

    public void validar(Prenda prenda) throws IllegalArgumentException {
        if (prenda.getColorPrincipal() == null || prenda.getColorPrincipal().isEmpty()) {
            throw new IllegalArgumentException("La prenda debe tener un color principal válido.");
        }
    }

}
