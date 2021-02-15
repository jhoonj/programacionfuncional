package co.com.programacionfucional.superfunciones.interfaces.clases;

import co.com.programacionfucional.superfunciones.interfaces.Potencia;

public class Cubos implements Potencia {
    @Override
    public Integer calcular(Integer valor) {
        return valor*valor*valor;
    }
}
