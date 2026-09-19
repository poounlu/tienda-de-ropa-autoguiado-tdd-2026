package ar.edu.unlu.poo.tienda;

/**
 * Subclase que especializa a Prenda para los pantalones.
 * Un Pantalón aplica un descuento del 10% sobre su precio base si pertenece a una temporada anterior.
 *
 * TAREA PARA EL ESTUDIANTE:
 * Completá los bloques marcados con // TODO siguiendo el ejemplo de Remera.java
 */
public class Pantalon extends Prenda {
    private boolean esTemporadaAnterior;

    public Pantalon(String nombre, double precioBase, boolean esTemporadaAnterior) {
        // TODO 1: Invocar al constructor de la superclase Prenda usando super(nombre, precioBase).
        super(nombre, precioBase);
        this.esTemporadaAnterior = esTemporadaAnterior;
    }

    public boolean isEsTemporadaAnterior() {
        return this.esTemporadaAnterior;
    }

    // TODO 2: Sobreescribir (@Override) el método calcularPrecioFinal().
    // Regla de negocio:
    // 1. Obtener el precio base llamando a super.calcularPrecioFinal().
    // 2. Si esTemporadaAnterior es true, aplicar un descuento del 10% (multiplicar por 0.90).
    // 3. Retornar el total correspondiente.
    @Override
    public double calcularPrecioFinal() {
        // Implementá aquí la lógica para que el test unitario testPantalonTemporadaAnteriorAplicaDescuento() pase a VERDE:
        return 0.0; // TODO: Reemplazar por la lógica correcta
    }
}
