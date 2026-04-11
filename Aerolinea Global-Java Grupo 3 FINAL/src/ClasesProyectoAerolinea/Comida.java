/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesProyectoAerolinea;

/**
 *
 * @author eltro
 */
public class Comida {

    String nombre;
    String categoria; // "DutyFree", "Snack", "Bebida", "Electronica" //HAY QUE AGREGAR MAS OPCIONES JAJAJA PERO NO SE ME OCURRIO NADA
    double precio;
    double IVA = 0.13;

    public Comida(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int esDutyFreeono() {
        if (categoria.equals("DutyFree") || categoria.equals("Electronica")) {
            return 1;
        } else {
            return 0;
        }
    }

    public double PrecioFinalcomida() {
        if (esDutyFreeono() == 1) {
            return precio;
        } else {
            return precio * (1 + IVA);
        }
    }

    public double Impuestaso() {
        if (esDutyFreeono() == 1) {
            return 0;
        } else {
            return precio * IVA;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }
}
