package Control;

import Modelo.Clientes;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ctrl_ClienteTest {

    @Test
    public void testAgregarYBuscar() {
        Ctrl_Cliente controller = new Ctrl_Cliente();
        Clientes cliente = new Clientes();
        cliente.setDni(12345678);
        cliente.setNombre("Cliente Prueba");
        cliente.setTelefono(987654321);

        controller.agregar(cliente);
        Clientes resultado = controller.buscar(12345678);

        assertNotNull(resultado);
        assertEquals("Cliente Prueba", resultado.getNombre());
    }

    @Test
    public void testEliminar() {
        Ctrl_Cliente controller = new Ctrl_Cliente();
        Clientes cliente = new Clientes();
        cliente.setDni(87654321);
        cliente.setNombre("Test Eliminar");
        cliente.setTelefono(912345678);

        controller.agregar(cliente);
        controller.eliminar(87654321);

        assertNull(controller.buscar(87654321));
    }
}
