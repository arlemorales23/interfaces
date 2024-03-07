package co.arle.poointerfaces.modelo;

public class Pagina extends Hoja implements Imprimible {
    // Here a class that implement a interface other
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
