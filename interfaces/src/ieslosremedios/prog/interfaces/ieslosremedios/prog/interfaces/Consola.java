package ieslosremedios.prog.interfaces;

public class Consola implements Imprimible {

    private String pantalla = PROMPT;
    private final static String PROMPT = "$";

    @Override
    public void borrar() {
        int longitud = pantalla.length();
        pantalla = "";
        for (int i = 0, i < longitud; i++) {
            pantalla += "*";
        }
    }

    @Override
    public void imprime() {
        System.out.printf("%S%n", pantalla);
    }

    public void String establecerContenido(String contenido) {
        pantalla = PROMPT + contenido;
    }


}
