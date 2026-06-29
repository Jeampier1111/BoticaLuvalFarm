
package Control;

import Control.*;
import Modelo.Clientes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

public class Ctrl_Cliente {

    String archivo = "libros.txt";
    String separador = ",";

    private ArrayList<Clientes> lstClientes = new ArrayList<>();

    public Ctrl_Cliente() {
        leer();
        
    }

    public void agregar(Clientes cliente) {
        lstClientes.add(cliente);
        guardar();
        guardarDatosClientes();
    }

    public void eliminar(int dni) {
        Clientes actual = buscar(dni);
        if (actual != null) {
            lstClientes.remove(actual);
            guardar();
            guardarDatosClientes();
        }
    }

    public Clientes buscar(int dni) {
        for (Clientes cliente : lstClientes) {
            if (cliente.getDni() == dni) {
                return cliente;
            }
        }
        return null;
    }

    public void modificar(Clientes cliente) {
      Clientes actual = buscar(cliente.getDni());
    if (actual != null) {
        actual.setNombre(cliente.getNombre());
        actual.setTelefono(cliente.getTelefono());
        actual.setDni(cliente.getDni());
        guardar();
        guardarDatosClientes();
    }
    }

    public void mostrarEnTabla(DefaultTableModel registro) {
       int contador =1;
        
        registro.setNumRows(0);
        for (Clientes cliente : lstClientes) {
            registro.addRow(new Object[]{
                contador++,               
                cliente.getNombre(),
                cliente.getTelefono(),
                cliente.getDni(),});
        }
    }

    private void guardar() {
        try {
            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            for (Clientes cliente : lstClientes) {
                String linea
                        = cliente.getNombre() + separador
                        + cliente.getTelefono() + separador
                        + cliente.getDni() + separador;

                pw.println(linea);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("Error al guardar datos");
        }

    }

    public ArrayList<Clientes> getLista() {
    return lstClientes;
}
   
    private void guardarDatosClientes() {
    try {
        FileWriter fw = new FileWriter("clientes.txt");
        PrintWriter pw = new PrintWriter(fw);
        for (Clientes cliente : lstClientes) {
            pw.println(cliente.getNombre() + ", Telefono: " + cliente.getTelefono() + ", DNI: " + cliente.getDni());
        }
        pw.close();
    } catch (IOException e) {
        System.err.println("Error al guardar datos de clientes: " + e.getMessage());
    }
}


    private void leer() {
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            lstClientes.clear();
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, separador);
                Clientes cliente = new Clientes();

                cliente.setNombre(datos.nextToken());
                cliente.setTelefono(Integer.parseInt(datos.nextToken()));
                cliente.setDni(Integer.parseInt(datos.nextToken()));
                lstClientes.add(cliente);

            }
        } catch (Exception e) {
            System.err.println("Error al listar datos");
            e.printStackTrace();
        }
    }

}