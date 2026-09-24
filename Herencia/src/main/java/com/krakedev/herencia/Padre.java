package com.krakedev.herencia;

/**
 *
 * @author asarango
 */
public class Padre {
    
    int virtudes;
    private int defectos;
    private double totalAhorrado;
    private String nombre; 
    
    // public Padre(){
    //     System.err.println("Constructor Vacio - Padre");
    // }

    public Padre(int virtudes , int defectos, String nombre){
        this.virtudes = virtudes;
        this.defectos = defectos;
        this.nombre = nombre; 
    }
    
    public void imprimir(){
        
        System.out.println("Virtudes: " + virtudes);
        System.out.println("Defectos: " + defectos);
    }
    
    public void guardarSecreto(){
        System.out.println("Esto no se hereda");
    }
    
     //Metodo Ahorrar
    public void ahorrar(double monto) {
        totalAhorrado += monto;
    }
    
    
    //Metodo que se utiliz para sobreescrinir toString
    // public String toString(){ 
    //     return "Defectos: " + defectos + " "+ "Virtudes: " + virtudes;
    // }
    
    //@Override  //Nos ayuda a verificar que exista el metodo
    //public String toString() {
      //  return "Padre [virtudes=" + virtudes + ", defectos=" + defectos + ", toString()=" + super.toString() + "]";
    //}
    
    @Override
    public String toString() {
        return "Padre [ Nombre= " + nombre + ",Virtudes=" + virtudes + ", Defectos=" + defectos + ", Total Ahorrado=" + totalAhorrado + "]";
    }
    
    /**
     * @return the defectos
     */
    public int getDefectos() {
        return defectos;
    }

    /**
     * @param defectos the defectos to set
     */
    public void setDefectos(int defectos) {
        this.defectos = defectos;
    }

    /**
     * @return the virtudes
     */
    public int getVirtudes() {
        return virtudes;
    }

    /**
     * @param virtudes the virtudes to set
     */
    public void setVirtudes(int virtudes) {
        this.virtudes = virtudes;
    }
    
    /**
     * @return the totalAhorrado
     */
    public double getTotalAhorrado() {
        return totalAhorrado;
    }

    /**
     * @param totalAhorrado the totalAhorrado to set
     */
    public void setTotalAhorrado(double totalAhorrado) {
        this.totalAhorrado = totalAhorrado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
