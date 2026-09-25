package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.FiguraPadre;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

/**
 *
 * @author asarango
 */
public class TestPolimorfismo {

    public static void main(String[] args) {
        
        //Instanciamos el Graficador
        Graficador graficador = new Graficador();

        // Declaramos variables de tipo Figura, pero guardamos objetos hijos y sobreescribimos con polimorfismo en las clases hijas
        FiguraPadre f1 = new Cuadrado("Cuadrado", "Rojo", 5);
        FiguraPadre f2 = new Rectangulo("Rectangulo", "Azul", 4, 7);
        
        //Instanciamos el TrianguloRectangulo (catetos de 3 y 4)
        // La hipotenusa debería calcularse sola y dar 5
        FiguraPadre f3 = new TrianguloRectangulo("Triangulo Rectangulo", "Morado", 3, 4);

        //Ejecutamos el método pasandole estas figuras
        graficador.graficar(f1); // Se usa la formula del Cuadrado
        graficador.graficar(f2); // Se usa la formula del Rectangulo
        graficador.graficar(f3); // ¡Aquí probamos la nueva figura!
        
    }
    
}
