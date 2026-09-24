package com.krakedev.herencia;

/**
 *
 * @author asarango
 */
public class Hija extends Padre{
    
    //Llama al constructor Vacio sin la nesesidad de colocarlo
    // public Hija(){
    //     super();
    // }
    
   //Llama al constructor con parametros
   public Hija(int virtudes, int defectos){
      super(virtudes, defectos);
   }
   
   public void escucharBadBunny(){
       
       System.out.println("Escuchando esa musica horrible");
   }

   @Override //metodo toString sobreescrito
   public String toString() {
       return "Hija [Virtudes=" + getVirtudes()+ ", Defectos=" + getDefectos() + "]";
   }
}
