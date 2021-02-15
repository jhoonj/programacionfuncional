package co.com.programacionfucional.superfunciones;

import co.com.programacionfucional.superfunciones.interfaces.Potencia;
import co.com.programacionfucional.superfunciones.interfaces.Predicado;

import java.util.ArrayList;
import java.util.List;

public class Superfunciones {
    public static List<Integer> filtrar(List<Integer> valores, Predicado predicado){
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor: valores ) {
            if(predicado.test(valor)){
                resultado.add(valor);
            }

            
        }
    return resultado;
    }


    public static List<Integer> calcular(List<Integer> valores, Potencia potencia){
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor: valores ) {
            resultado.add(potencia.calcular(valor));
        }
        return resultado;
    }

}
