public class TestRestaurante {
    public static void main(String[] args) {
        // 1. Crea un objeto de la clase Restaurante para Instanciar los dos restaurantes
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

       // 2. Mostrar los valores por defecto en consola
       System.out.println("Valores por defecto");
        System.out.println("=== DATOS DEL RESTAURANTE 1 ===");
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Dirección: " + rest1.getDireccion());
        System.out.println("Calificación: " + rest1.getCalificacion() + " estrellas\n");
        System.out.println();
        System.out.println("=== DATOS DEL RESTAURANTE 2 ===");
        System.out.println("Nombre: " + rest2.getNombre());
        System.out.println("Dirección: " + rest2.getDireccion());
        System.out.println("Calificación: " + rest2.getCalificacion() + " estrellas");
       
       
        // 3. Modificar los valores de sus atributos
        rest1.setNombre("Restaurante El Andino");
        rest1.setDireccion("Calle Larga 456, Cuenca");
        rest1.setCalificacion(4.6); 

        rest2.setNombre("Sabor de la Sierra");       
        rest2.setDireccion("Av. 12 de Abril 789, Cuenca");
        rest2.setCalificacion(4.2);
        
        // 4. Mostrar los valores en consola
        System.out.println();
        System.out.println("Con valores cargados");
        System.out.println("=== DATOS DEL RESTAURANTE 1 ===");
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Dirección: " + rest1.getDireccion());
        System.out.println("Calificación: " + rest1.getCalificacion() + " estrellas\n");
        System.out.println();
        System.out.println("=== DATOS DEL RESTAURANTE 2 ===");
        System.out.println("Nombre: " + rest2.getNombre());
        System.out.println("Dirección: " + rest2.getDireccion());
        System.out.println("Calificación: " + rest2.getCalificacion() + " estrellas");
    }
}
