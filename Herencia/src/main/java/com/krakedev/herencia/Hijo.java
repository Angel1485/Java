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
        return "Hijo [Virtudes=" + getVirtudes() + ", Defectos=" + getDefectos() + ", Juguetes=" + juguetes + "]";
    }
    
  }
