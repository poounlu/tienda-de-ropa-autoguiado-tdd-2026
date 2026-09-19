package ar.edu.unlu.poo.tienda;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase cliente que administra una colección de prendas en una transacción de venta.
 * Demuestra el Polimorfismo de Inclusión y el Principio de Sustitución de Liskov (LSP).
 */
public class Venta {
    private List<Prenda> prendas;

    public Venta() {
        this.prendas = new ArrayList<>();
    }

    public void agregarPrenda(Prenda prenda) {
        if (prenda == null) {
            throw new IllegalArgumentException("La prenda no puede ser nula");
        }
        this.prendas.add(prenda);
    }

    public List<Prenda> getPrendas() {
        return new ArrayList<>(this.prendas);
    }

    /**
     * Calcula el total de la venta sumando el precio final de cada prenda agregada.
     *
     * RESTRICCIÓN DIDÁCTICA ESTRICTA:
     * Está prohibido usar 'instanceof', 'getClass()' o comprobaciones de tipo manuales.
     * El cálculo debe resolverse puramente mediante el despacho dinámico de métodos (polimorfismo).
     *
     * @return suma de los precios finales de todas las prendas de la venta.
     */
    public double calcularTotal() {
        // TODO 3: Iterá sobre la lista de prendas acumulando en una variable local
        // el resultado de invocar prenda.calcularPrecioFinal().
        double total = 0.0;

        // Escribí aquí tu bucle:

        return total;
    }
}
