package co.com.programacionfucional.superfunciones.interfaces.clases;

import co.com.programacionfucional.superfunciones.interfaces.Predicado;

public class SoloImpares implements Predicado {
    @Override
    public Boolean test(Integer valor) {
        return (valor%2!=0);
    }
}
