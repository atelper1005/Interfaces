package ieslosremedios.prog.interfaces;

public class Impresora implements Imprimible {
    private String pagina;

    public Impresora() {
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido(String contenido) {
        pagina = contenido;
    }

    @Override
    public void borrar() {
        pagina = "";
    }
}
