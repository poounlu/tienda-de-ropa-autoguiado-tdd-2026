package ar.edu.unlu.poo.tienda;

/**
 * Superclase que modela las características comunes a todas las prendas del catálogo.
 */
public class Prenda {
    // Atributos protegidos (# en UML) para permitir visibilidad en las subclases
    protected String nombre;
    protected double precioBase;

    public Prenda(String nombre, double precioBase) {
        if (precioBase < 0) {
            throw new IllegalArgumentException("El precio base no puede ser negativo");
        }
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    /**
     * Calcula el precio final de la prenda.
     * En la clase base retorna el precio base. Las subclases sobreescriben (@Override)
     * este método para especializar el cálculo según sus reglas de negocio particulares.
     *
     * @return precio final de venta de la prenda.
     */
    public double calcularPrecioFinal() {
        return this.precioBase;
    }
}
