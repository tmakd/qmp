package Guardarropas;

import Guardarropas.Validaciones.EstrategiaValidacionPrenda;
import Guardarropas.Validaciones.FaltaElColorPrimario;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private String material; // TODO: capaz en otra iteracion termina siendo una clase o enum
    private String colorPrincipal;
    private String colorSecundario;


    public Prenda(TipoPrenda tipoPrenda, String material, String colorPrincipal, String colorSecundario) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    public final void validarPrenda() {
        validarTipo();
        validarCategoria();
        validarColores();
    }

    // Validaciones
    protected void validarTipo(){}
    protected void validarCategoria(){}
    protected void validarColores(){
        validarColorPrincipal();
    }

    protected void validarColorPrincipal() {
        EstrategiaValidacionPrenda estrategia = new FaltaElColorPrimario();
        estrategia.validar(this);
    }


    public String getColorPrincipal() {
        return this.colorPrincipal;
    }

    public TipoPrenda getTipoPrenda () {
        return this.tipoPrenda;
    }
}