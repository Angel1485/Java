public class TestRestaurante {
    public static void main(String[] args) {
        // 1. Crea un objeto de la clase Restaurante para Instanciar los dos restaurantes
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

        // 2. Modificar los valores de sus atributos
        rest1.nombre = "Restaurante El Andino";
        rest1.direccion = "Calle Larga 456, Cuenca";
        rest1.calificacion = 4.6;

        rest2.nombre = "Sabor de la Sierra";
        rest2.direccion = "Av. 12 de Abril 789, Cuenca";
        rest2.calificacion = 4.2;

        // 3. Mostrar los valores en consola
        System.out.println("=== DATOS DEL RESTAURANTE 1 ===");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion + " estrellas\n");

        System.out.println("=== DATOS DEL RESTAURANTE 2 ===");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion + " estrellas");
    }
}
