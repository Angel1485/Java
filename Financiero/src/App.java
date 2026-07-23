import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos un cliente
        Cliente cli1 = new Cliente("0105678901", "María", "López");

        // Creamos una cuenta
        Cuenta cue1 = new Cuenta("CT-001");
        cue1.setTipo("C"); // Cambiamos a Corriente
        cue1.setSaldoActual(1500.75);

        // Asignamos el cliente como propietario de la cuenta
        cue1.setPropietario(cli1);

        // Mostramos toda la información
        cue1.imprimir();
    }
}
