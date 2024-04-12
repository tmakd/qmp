package Guardarropas;

public enum TipoPrenda {
// TODO: esto no me convence del todo, vi que estaba en la guia, pero haria un hash o un archivo de configuracion donde relacione tipo-categoria.
    ZAPATOS {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.CALZADO;
        }
    },
    ZAPATILLAS {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.CALZADO;
        }
    },
    CAMISA_MANGAS_CORTA {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.PARTE_SUPERIOR;
        }
    },
    CAMISA_MANGAS_LARGA {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.PARTE_SUPERIOR;
        }
    },
    REMERA {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.PARTE_SUPERIOR;
        }
    },
    PANTALON {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.PARTE_INFERIOR;
        }
    },
    CAMPERA {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.PARTE_SUPERIOR;
        }
    },
    BUFANDA {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.ACCESORIO;
        }
    },
    CUELLITO {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.ACCESORIO;
        }
    },
    GORRA {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.ACCESORIO;
        }
    },
    SWETER {
        @Override
        public CategoriaPrenda getCategoria() {
            return CategoriaPrenda.PARTE_SUPERIOR;
        }
    };

    public abstract CategoriaPrenda getCategoria();
}