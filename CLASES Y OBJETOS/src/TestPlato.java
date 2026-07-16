public class TestPlato {
    public static void main(String[] args) {
        // 1. Declarar las 3 variables de tipo Plato
        Plato platoA = new Plato();
        Plato platoB = new Plato();;
        Plato platoC = new Plato();;

        // 2. Mostrar todos los valores por defecto en consola
        System.out.println("Valores por defecto");
        System.out.println("=== PLATO A ===");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + (platoA.disponible ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO B ===");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + (platoB.disponible ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO C ===");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + (platoC.disponible ? "Sí" : "No"));


        // 3. Modificar los atributos con valores reales
        // Plato A
        platoA.nombre = "Sopa de quinua";
        platoA.tipo = "Entrada";
        platoA.precio = 3.25;
        platoA.disponible = true;

        // Plato B
        platoB.nombre = "Cuy asado con papas";
        platoB.tipo = "Plato Fuerte";
        platoB.precio = 8.50;
        platoB.disponible = true;

        // Plato C
        platoC.nombre = "Dulce de higo con queso";
        platoC.tipo = "Postre";
        platoC.precio = 2.75;
        platoC.disponible = false;


        // 4. Mostrar todos los valores en consola
        System.out.println();
        System.out.println("Con valores cargados");
        System.out.println("=== PLATO A ===");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + (platoA.disponible ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO B ===");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + (platoB.disponible ? "Sí" : "No") + "\n");
        System.out.println();
        System.out.println("=== PLATO C ===");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + (platoC.disponible ? "Sí" : "No"));
    }
}
