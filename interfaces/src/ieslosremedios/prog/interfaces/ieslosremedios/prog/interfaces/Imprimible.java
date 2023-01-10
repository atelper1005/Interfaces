package ieslosremedios.prog.interfaces;

public interface Imprimible{

    final String TEXTO_POR_DEFECTO = "Pagina de prueba";

    void imprime();

    String establecerContenido(String a);
}
