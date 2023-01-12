package ieslosremedios.prog.interfaces;

public interface Imprimible extends Borrable, Editable{

    String TEXTO_POR_DEFECTO = "Pagina de prueba";

    void imprime();
}
