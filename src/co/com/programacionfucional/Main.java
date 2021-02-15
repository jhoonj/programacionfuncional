package co.com.programacionfucional;

import co.com.programacionfucional.superfunciones.Superfunciones;
import co.com.programacionfucional.superfunciones.interfaces.clases.SoloImpares;
import co.com.programacionfucional.superfunciones.interfaces.clases.Cubos;
import static java.lang.System.out;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numero = List.of(10,12,58,13,25);
        List<Integer> filtrados = Superfunciones.filtrar(numero, new SoloImpares());
        out.println(filtrados);
        List<Integer> cubos = Superfunciones.calcular(filtrados, new Cubos());
        out.println(cubos);

    }







}
