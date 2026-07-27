package com.krakedev.artesanal;

import java.util.ArrayList; // Importante para usar ArrayList

public class NegocioMejorado {

     private ArrayList<Maquina> maquinas;
     //PUNTO 8: No inicializar aún Para que de el NullException -  PUNTO 11: Se corrige el error inicializando el arrayList
     private ArrayList<Cliente> clientes = new ArrayList<>();

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

    // 9. RegistrarCliente
    public void registrarCliente(String nombre, String cedula) {
        Cliente nuevoCliente = new Cliente(nombre, cedula);
        // Asignamos código y total
        nuevoCliente.setCodigo(clientes.size() + 1);
        nuevoCliente.setTotalConsumido(0.0);
        clientes.add(nuevoCliente);
    }

    // 13. Método buscarClientePorCedula
    public Cliente buscarClientePorCedula(String cedula) {
        // Usa for como lo exige el taller
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCedula().equals(cedula)) {
                return c; // Encontrado
            }
        }
        return null; // No existe
    }

    // 14. Método buscarClientePorCodigo
    public Cliente buscarClientePorCodigo(int codigo) {
        // Mismo funcionamiento, pero busca por código
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCodigo() == codigo) {
                return c; // Encontrado
            }
        }
        return null; // No existe
    }

    // 15. Método consumirCerveza
    public void consumirCerveza(String codigoMaquina, int codigoCliente, double cantidad) {

        Maquina maquina = recuperarMaquina(codigoMaquina);
        Cliente cliente = buscarClientePorCodigo(codigoCliente);

        // Solo si ambos existen
        if (maquina != null && cliente != null) {
            // Invocar servirCerveza y guardar el resultado
            double valorConsumido = maquina.servirCerveza(cantidad);
            // Llamar a registrarConsumo (integración punto 17)
            registrarConsumo(cliente, valorConsumido);
        }
    }

     // 16. Método registrarConsumo
    private void registrarConsumo(Cliente cliente, double valor) {
        // Acumular (NO reemplazar)
        cliente.setTotalConsumido(cliente.getTotalConsumido() + valor);
    }

     // 19. Método consultarValorVendido
    public double consultarValorVendido() {
        double totalGeneral = 0;
        // Recorremos TODA la lista de clientes
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            // Acumulamos el total consumido de cada uno
            totalGeneral += c.getTotalConsumido();
        }
        return totalGeneral;
    }

    // Getter y Setter
    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }
    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

}
