public class TestPlato {
    public static void main(String[] args) {
        // 1. Declarar las 3 variables de tipo Plato
        Plato platoA = new Plato();
        Plato platoB = new Plato();;
        Plato platoC = new Plato();;

        // 2. Mostrar todos los valores por defecto en consola
        System.out.println("Valores por defecto");
        System.out.println("=== PLATO A ===");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: $" + platoA.getPrecio());
        System.out.println("Disponible: " + (platoA.isDisponible() ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO B ===");
        System.out.println("Nombre: " + platoB.getNombre());
        System.out.println("Tipo: " + platoB.getTipo());
        System.out.println("Precio: $" + platoB.getPrecio());
        System.out.println("Disponible: " + (platoB.isDisponible() ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO C ===");
        System.out.println("Nombre: " + platoC.getNombre());
        System.out.println("Tipo: " + platoC.getTipo());
        System.out.println("Precio: $" + platoC.getPrecio());
        System.out.println("Disponible: " + (platoC.isDisponible() ? "Sí" : "No"));

        // 3. Modificar los atributos con valores reales
        // Plato A
        platoA.setNombre("Sopa de quinua");
        platoA.setTipo("Entrada"); 
        platoA.setPrecio(3.25);
        platoA.setDisponible(true);

        // Plato B
        platoB.setNombre("Cuy asado con papas");
        platoB.setTipo("Plato Fuerte"); 
        platoB.setPrecio(8.50);
        platoB.setDisponible(true);

        // Plato C
        platoC.setNombre("Dulce de higo con queso");
        platoC.setTipo("Postre"); 
        platoC.setPrecio(2.75);
        platoC.setDisponible(false);

        // 4. Mostrar todos los valores en consola
        System.out.println();
        System.out.println("Con valores cargados");
        System.out.println("=== PLATO A ===");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: $" + platoA.getPrecio());
        System.out.println("Disponible: " + (platoA.isDisponible() ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO B ===");
        System.out.println("Nombre: " + platoB.getNombre());
        System.out.println("Tipo: " + platoB.getTipo());
        System.out.println("Precio: $" + platoB.getPrecio());
        System.out.println("Disponible: " + (platoB.isDisponible() ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO C ===");
        System.out.println("Nombre: " + platoC.getNombre());
        System.out.println("Tipo: " + platoC.getTipo());
        System.out.println("Precio: $" + platoC.getPrecio());
        System.out.println("Disponible: " + (platoC.isDisponible() ? "Sí" : "No"));
    }
}
