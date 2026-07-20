public class Plato {
    // Atributos solicitados
    private String nombre;
    private String tipo;       // Ej: Entrada, Plato Fuerte, Postre
    private double precio;     // Punto flotante
    private boolean disponible;// Verdadero o Falso

    public Plato() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
