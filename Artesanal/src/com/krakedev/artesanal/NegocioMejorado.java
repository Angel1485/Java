package com.krakedev.artesanal;

import java.util.ArrayList; // Importante para usar ArrayList

public class NegocioMejorado {

     private ArrayList<Maquina> maquinas;

    // Constructor
    public NegocioMejorado() {
        maquinas = new ArrayList<>();
    }

    // 3. Método generarCodigo
    public String generarCodigo() {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        return "M-" + numeroAleatorio;
    }

    // 5. Método cargarMaquinas (ejemplo de llenar lista con for)
    public void cargarMaquinas() {
        // Ejemplo: creamos 3 máquinas de prueba
        for (int i = 0; i < 3; i++) {
            agregarMaquina("Cerveza " + (i+1), "Máquina proceso " + (i+1), 0.5 + (i*0.2));
        }
    }

    // 6. Método recuperarMaquina
    public Maquina recuperarMaquina(String codigo) {
        for (Maquina m : maquinas) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null; // No encontrado
    }

    // 4 Agregar maquina y 7. Método agregarMaquina MODIFICADO (valida duplicados)
    public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorML) {
        String codigo = generarCodigo();
        // Validamos si ya existe el código
        if (recuperarMaquina(codigo) != null) {
            return false; // Código repetido, no se agrega
        }else{
            Maquina nuevaMaquina = new Maquina(codigo, nombreCerveza, descripcion,  precioPorML );
            maquinas.add(nuevaMaquina);
            return true; // Agregado correctamente
        }
        
    }

    // Getter y Setter
    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }
    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

}
