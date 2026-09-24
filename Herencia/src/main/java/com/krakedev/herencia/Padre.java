package com.krakedev.herencia;

/**
 *
 * @author asarango
 */
public class Padre {
    
    int virtudes;
    private int defectos;
    
    // public Padre(){
    //     System.err.println("Constructor Vacio - Padre");
    // }

    public Padre(int virtudes , int defectos){
        this.virtudes = virtudes;
        this.defectos = defectos;
    }
    
    public void imprimir(){
        
        System.out.println("Virtudes: " + virtudes);
        System.out.println("Defectos: " + defectos);
    }
    
    public void guardarSecreto(){
        System.out.println("Esto no se hereda");
    }
    
    //Metodo que se utiliz para sobreescrinir toString
    // public String toString(){ 
    //     return "Defectos: " + defectos + " "+ "Virtudes: " + virtudes;
    // }
    
    @Override  //Nos ayuda a verificar que exista el metodo
    public String toString() {
        return "Padre [virtudes=" + virtudes + ", defectos=" + defectos + ", toString()=" + super.toString() + "]";
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
}
