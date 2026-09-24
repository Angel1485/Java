package com.krakedev.herencia;

/**
 *
 * @author asarango
 */
public class Hijo extends Padre{
    
    private int juguetes;
            
    public Hijo(int virtudes, int defectos, int juguetes) {
        super(virtudes, defectos);
        this.juguetes = juguetes; //Se asigna directamente
    }
    
    @Override //metodo toString sobreescrito
    public String toString() {
        return "Hijo [Virtudes=" + getVirtudes() + ", Defectos=" + getDefectos() + ", Juguetes=" + juguetes + ", Total Ahorrado=" + getTotalAhorrado() +"]";
    }
    
     // Metodo Ahorar sobreescrito
    @Override
    public void ahorrar(double monto) {
        // El hijo solo ahorra el 50% del monto dado.
        // Usamos super.ahorrar() ya que es publico para reutilizar el metodo del Padre.
        super.ahorrar(monto * 0.5); 
    }
    
  }
