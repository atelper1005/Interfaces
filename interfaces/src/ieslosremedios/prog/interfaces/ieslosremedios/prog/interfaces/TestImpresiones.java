package ieslosremedios.prog.interfaces;

public class TestImpresiones {
    public static void main(String[] args) {

        Impresora a = new Impresora();
        a.imprime;

        Impresora b = new Impresora();
        b.borrar;

        Impresora c = new Impresora();
        c.establecerContenido;

        //Funciona porque se permite la implementación gracias a la flexibilidad de las interfaces
        Imprimible z = new Imprimible() {
            @Override
            public void imprime() {

            }

            @Override
            public String establecerContenido(String a) {
                return null;
            }
        };
    }
}