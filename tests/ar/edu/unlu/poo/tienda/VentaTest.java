package ar.edu.unlu.poo.tienda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Batería de pruebas unitarias automatizadas con JUnit 5.
 *
 * DINÁMICA ASINCRÓNICA:
 * Al clonar el proyecto y ejecutar los tests:
 * - Los tests de Remera pasarán en VERDE (ejemplo de referencia resuelto).
 * - Los tests de Pantalón y Venta estarán en ROJO hasta que completes los // TODO.
 * - Tu objetivo es lograr que todos los tests queden en VERDE.
 */
public class VentaTest {

    private Venta venta;

    @BeforeEach
    public void setUp() {
        venta = new Venta();
    }

    @Test
    public void testRemeraImportadaAplicaRecargo() {
        // Remera base: 1000.0, importada: true, recargo estampado: 250.0 -> total: 1250.0
        Prenda remera = new Remera("Remera Estampada", 1000.0, true, 250.0);
        assertEquals(1250.0, remera.calcularPrecioFinal(), 0.001,
                "La remera importada debe sumar el recargo por estampado al precio base");
    }

    @Test
    public void testRemeraNacionalNoAplicaRecargo() {
        // Remera base: 1000.0, importada: false, recargo: 250.0 -> total: 1000.0
        Prenda remera = new Remera("Remera Lisa", 1000.0, false, 250.0);
        assertEquals(1000.0, remera.calcularPrecioFinal(), 0.001,
                "La remera nacional no debe sumar el recargo por estampado");
    }

    @Test
    public void testPantalonTemporadaAnteriorAplicaDescuento() {
        // Pantalón base: 2000.0, temporada anterior: true -> 2000 - 10% = 1800.0
        Prenda pantalon = new Pantalon("Jean Clásico", 2000.0, true);
        assertEquals(1800.0, pantalon.calcularPrecioFinal(), 0.001,
                "El pantalón de temporada anterior debe aplicar un 10% de descuento sobre el precio base");
    }

    @Test
    public void testPantalonTemporadaActualSinDescuento() {
        // Pantalón base: 2000.0, temporada anterior: false -> 2000.0
        Prenda pantalon = new Pantalon("Jean Colección Nueva", 2000.0, false);
        assertEquals(2000.0, pantalon.calcularPrecioFinal(), 0.001,
                "El pantalón de temporada actual debe mantener el precio base sin descuento");
    }

    @Test
    public void testCalculoTotalVentaPolimorfico() {
        // Configuramos una venta con una colección polimórfica heterogénea
        venta.agregarPrenda(new Remera("Remera Lisa", 1000.0, false, 200.0));     // 1000.0
        venta.agregarPrenda(new Remera("Remera Importada", 1000.0, true, 300.0));  // 1300.0
        venta.agregarPrenda(new Pantalon("Pantalón Nuevo", 2000.0, false));         // 2000.0
        venta.agregarPrenda(new Pantalon("Pantalón Outlet", 2000.0, true));         // 1800.0

        // Total esperado: 1000.0 + 1300.0 + 2000.0 + 1800.0 = 6100.0
        assertEquals(6100.0, venta.calcularTotal(), 0.001,
                "El total de la venta debe sumar polimórficamente los precios finales de todas las prendas");
    }

    @Test
    public void testPrendaNoPermitePrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Prenda("Prenda Inválida", -50.0);
        }, "No debería permitirse instanciar prendas con precio base negativo");
    }
}
