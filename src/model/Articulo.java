package model;

/**
 * Created by artiaga on 18/4/17.
 */
public class Articulo {

    //Atributos

    private String nombre;
    private double precio;

    //Conbstructores


    public Articulo() {
    }

    public Articulo(String nombre, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }


    //Accesores


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
