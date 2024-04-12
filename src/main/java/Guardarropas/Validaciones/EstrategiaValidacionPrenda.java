package Guardarropas.Validaciones;

import Guardarropas.Prenda;


// Cree esta clase porque estaba repitiendo codigo
// Para dar un ejemplo de una prenda "parecida" cree Zapatillas
public interface EstrategiaValidacionPrenda {
    void validar(Prenda prenda) throws IllegalArgumentException;
}