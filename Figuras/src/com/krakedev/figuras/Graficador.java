package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class Graficador {
    
    // El método recibe un objeto de tipo FiguraPadre (puede ser FiguraPadre, Cuadrado o Triangulo)
    public void graficar(FiguraPadre figura) {
        
        // Usamos los getters para obtener el nombre y el color del objeto que recibimos.
        // Usamos toUpperCase() para que el texto salga en MAYÚSCULAS como en el ejemplo.
//        String nombreMayusculas = figura.getNombre().toUpperCase();
//        String colorMayusculas = figura.getColor().toUpperCase();
//        
//        // Imprimimos el resultado
//        //System.out.println("Graficando " + nombreMayusculas + " de color " + colorMayusculas);
//        
//        int perimetro = figura.calcularPerimetro();  //Aqui se usa el polimorfismo
//        //System.out.println(" -> Perimetro calculado: " + perimetro);
//        
//        //Calculamos el area usando el nuevo metodo
//        double area = figura.calcularArea();
//        
        //Nuevos:
//        double diametro = figura.calcularDiametro();
//        double apotema = figura.calcularApotema();
//        double areaCircunscrita = figura.calcularAreaCircunscrita();
//        double areaInscrita = figura.calcularAreaInscrita();
//        double volumen = figura.calcularVolumen(10); // Le pasas una profundidad
            figura.imprimirDetalle();
        
        //Imprimimos todo en una sola linea
     //   System.out.println("Graficando " + nombreMayusculas + " de color " + colorMayusculas + " con perimetro " + perimetro + " area " + area + " volumen " + volumen);
        
    }
    
}
