package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.FiguraPadre;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

/**
 *
 * @author asarango
 */
public class TestGraficar {

    public static void main(String[] args) {
        
        // 1. Instanciar el Graficador
        Graficador graficador = new Graficador();

        // 2. Instanciar los diferentes objetos
        // (Usamos los constructores que hemos ido creando en los ejercicios anteriores)
        FiguraPadre figura = new FiguraPadre("Figura", "Amarillo");
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul" , 5 , 2);
        Triangulo triangulo = new Triangulo ("Triangulo", "Verde");

        // 3. Invocar el método graficar para cada objeto
        graficador.graficar(figura);
        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
        graficador.graficar(triangulo);  

    }
    
}
