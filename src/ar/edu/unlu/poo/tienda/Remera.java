package ar.edu.unlu.poo.tienda;

/**
 * Subclase que especializa a Prenda para el caso de las remeras.
 * Una Remera suma un recargo fijo por estampado si es declarada como importada.
 *
 * NOTA DIDÁCTICA: Esta clase se provee completamente implementada como caso testigo.
 * Observá cómo invoca al constructor del padre mediante super(...) y cómo
 * sobreescribe calcularPrecioFinal() reutilizando la lógica base con super.calcularPrecioFinal().
 */
public class Remera extends Prenda {
    private boolean esImportada;
    private double recargoEstampado;

    public Remera(String nombre, double precioBase, boolean esImportada, double recargoEstampado) {
        // Invocamos al constructor de la superclase Prenda (debe ser la primera línea)
        super(nombre, precioBase);
        this.esImportada = esImportada;
        this.recargoEstampado = recargoEstampado;
    }

    public boolean isEsImportada() {
        return this.esImportada;
    }

    public double getRecargoEstampado() {
        return this.recargoEstampado;
    }

    @Override
    public double calcularPrecioFinal() {
        // Reutilizamos el cálculo de la superclase mediante super.
        double precio = super.calcularPrecioFinal();
        if (this.esImportada) {
            precio += this.recargoEstampado;
        }
        return precio;
    }
}
