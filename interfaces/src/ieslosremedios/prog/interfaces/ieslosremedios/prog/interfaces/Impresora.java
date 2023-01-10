package ieslosremedios.prog.interfaces;

public class Impresora implements Imprimible {
    String pagina;

    public Impresora() {
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public String establecerContenido(String a) {
        return null;
    }

    @Override
    public String establecerContenido() {
        System.out.println("Esto es un test");
    }

    @Override
    public void borrar() {
        System.out.println("****");
    }
}
