package ieslosremedios.prog.interfaces;

public interface Editable extends Imprimible, Borrable{

    //Sigue funcionando porque con las interfaces es posible que los métodos sean heredables varias veces
    void establecerContenido(String contenido);

}
