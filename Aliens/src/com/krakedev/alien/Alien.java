package com.krakedev.alien;

public class Alien {
    // Atributos privados
    private int tamano;
    private String color;
    private int numeroOjos;
    private int numeroBrazos;
    private int numeroPatas;
    private double precioExtremidad;
    private double precioOjo;
    private double precioCuerpo;
    private double precioTotal;

    // Constructor: recibe solo tamaño y color, con validaciones y cálculos automáticos
    public Alien(int tamano, String color) {
        // Validación del rango de tamaño
        if (tamano < 5) {
            this.tamano = 5;
        } else if (tamano > 30) {
            this.tamano = 30;
        } else {
            this.tamano = tamano;
        }

        this.color = color;

        // Cálculos automáticos de precios
        this.precioCuerpo = this.tamano * 0.20;   // 20% del tamaño
        this.precioExtremidad = this.tamano * 0.10; // 10% del tamaño
        this.precioOjo = this.tamano * 0.05;      // 5% del tamaño
        calcularPrecioTotal();
    }

    // Método para mostrar todos los valores en consola
    public void imprimir() {
        System.out.println("=== DATOS DEL ALIEN ===");
        System.out.println("Tamaño: " + tamano + " cm");
        System.out.println("Color: " + color);
        System.out.println("Número de ojos: " + numeroOjos);
        System.out.println("Número de brazos: " + numeroBrazos);
        System.out.println("Número de patas: " + numeroPatas);
        System.out.println("Precio por extremidad: $" + precioExtremidad);
        System.out.println("Precio por ojo: $" + precioOjo);
        System.out.println("Precio del cuerpo: $" + precioCuerpo);
        System.out.println("------------------------");
    }


    // MÉTODO: AGREGAR BRAZOS
    public boolean agregarBrazos(int cantidadBrazos) {
        // Calculamos el total actual de extremidades
        int totalExtremidades = this.numeroBrazos + this.numeroPatas;
        // Verificamos que no supere el límite de 10 en total
        if (totalExtremidades + cantidadBrazos <= 10) {
            this.numeroBrazos += cantidadBrazos;
            calcularPrecioTotal(); // Actualiza automáticamente
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO: AGREGAR PIERNAS
    public boolean agregarPiernas(int cantidadPatas) {
        // Usa la MISMA regla: total de extremidades (brazos + piernas) ≤ 10
        int totalExtremidades = this.numeroBrazos + this.numeroPatas;
        if (totalExtremidades + cantidadPatas <= 10) {
            this.numeroPatas += cantidadPatas;
            calcularPrecioTotal(); // Actualiza automáticamente
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO: AGREGAR OJOS 
    public boolean agregarOjos(int cantidadOjos) {
        int maximoPermitido;

        // Definir límite según tamaño validado
        if (this.tamano >= 5 && this.tamano <= 10) {
            maximoPermitido = 3;
        } else if (this.tamano > 10 && this.tamano <= 20) {
            maximoPermitido = 5;
        } else { // >20 y ≤30
            maximoPermitido = 7;
        }

        // Validar límite total de ojos
        if (this.numeroOjos + cantidadOjos <= maximoPermitido) {
            this.numeroOjos += cantidadOjos;
            calcularPrecioTotal(); // Actualiza el precio automáticamente
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO: CALCULAR PRECIO TOTAL 
    private void calcularPrecioTotal() {
        int totalExtremidades = this.numeroBrazos + this.numeroPatas;
        this.precioTotal = this.precioCuerpo
                        + (totalExtremidades * this.precioExtremidad)
                        + (this.numeroOjos * this.precioOjo);
    }




    // Getters para todos sin setters
    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getTamano() {
        return tamano;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroOjos() {
        return numeroOjos;
    }

    public int getNumeroBrazos() {
        return numeroBrazos;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public double getPrecioExtremidad() {
        return precioExtremidad;
    }

    public double getPrecioOjo() {
        return precioOjo;
    }

    public double getPrecioCuerpo() {
        return precioCuerpo;
    }

}
