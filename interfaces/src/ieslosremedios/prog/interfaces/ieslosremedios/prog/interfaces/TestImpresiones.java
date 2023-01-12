package ieslosremedios.prog.interfaces;

public class TestImpresiones {
    public static void main(String[] args) {

        Imprimible a = new Impresora();
        a.imprime();
        a.borrar();
        a.imprime();
        a.establecerContenido("Esto es un test");
        a.imprime();

        Imprimible b = new Impresora();
        b.imprime();
        b.borrar();
        b.imprime();
        b.establecerContenido("Esto es un test");
        b.imprime();

        Imprimible c = new Impresora();
        c.imprime();
        c.borrar();
        c.imprime();
        c.establecerContenido("Esto es un test");
        c.imprime();

        //Funciona porque se permite la implementación gracias a la flexibilidad de las interfaces
        Imprimible z = new Imprimible() {
            @Override
            public void establecerContenido(String contenido) {

            }

            @Override
            public void borrar() {

            }

            @Override
            public void imprime() {

            }

        };
    }
}