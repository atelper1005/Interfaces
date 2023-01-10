package ieslosremedios.prog.interfaces;

public class Consola implements Imprimible {

    String pantalla = "$ ls -la";

    public void imprime() {
        System.out.printf("%s", pantalla);
    }

    @Override
    public String establecerContenido(String a) {
        return null;
    }


}
