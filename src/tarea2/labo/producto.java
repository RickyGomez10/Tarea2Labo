package tarea2.labo;

public class producto {

    //atributos
    String nombre;
    int cantidad;
    int costo;
    int disponibilidad;

    //metodos
    public void cargarProducto(int cantidad) {
    }

    public void descargarProducto(int cantidad) {
    }

    public void descartarProducto(int disponibilidad) {
    }

    //constructor
    public producto(String _nombre, int _cantidad, int _costo) {
        this.nombre = _nombre;
        this.cantidad = _cantidad;
        this.costo = _costo;
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCosto() {
        return costo;
    }

    //setters
    public void setProducto(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

}
