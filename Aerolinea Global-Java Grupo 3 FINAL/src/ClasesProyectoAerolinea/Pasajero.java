/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesProyectoAerolinea;

/**
 *
 * @author eltro
 */
public class Pasajero {

    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String niveldSocio; // "Platino", "Oro", "Regular"

    public Pasajero(String id, String nombre, String apellido, String email, String nivelSocio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.niveldSocio = nivelSocio;
    }

    public double aplicarDescuento(double precio) { //Tiff use .equals, es lo mismo que == pero este si funciona con el programa
        if (niveldSocio.equals("Platino")) {
            return precio * 0.90;
        } else if (niveldSocio.equals("Oro")) {
            return precio * 0.95;
        } else {
            return precio;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivelSocio() {
        return niveldSocio;
    }

    public void setNivelSocio(String nivelSocio) {
        this.niveldSocio = nivelSocio;

    }

}
