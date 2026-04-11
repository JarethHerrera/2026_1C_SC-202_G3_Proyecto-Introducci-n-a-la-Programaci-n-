/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesProyectoAerolinea;

/**
 *
 * @author eltro
 */
public class Tiket {

    int contador = 1000;
    String numero;
    Pasajero pasajero;
    Volar vuelo;
    Asiento asiento;
    double precioPagado;
    String menuEspecial; 
    Comida[] productosAbordo; 
    int cantProductos;
    String estado; // "Activo", "Cancelado", "Check-in"

    public Tiket(Pasajero pasajero, Volar vuelo, Asiento asiento, double precioPagado) {
        this.numero = "TK" + (++contador);
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.precioPagado = precioPagado;
        this.menuEspecial = "Estándar";
        this.productosAbordo = new Comida[50];
        this.cantProductos = 0;
        this.estado = "Activo";
    }

    public void agregarProducto(Comida p) {
        if (cantProductos < productosAbordo.length) {
            productosAbordo[cantProductos++] = p;
        }
    }

    public double getTotalProductos() {
        double total = 0;
        for (int i = 0; i < cantProductos; i++) {
            total += productosAbordo[i].PrecioFinalcomida();
        }
        return total;
    }

}
