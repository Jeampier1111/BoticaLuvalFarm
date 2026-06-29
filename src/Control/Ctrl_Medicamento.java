
package Control;

import Control.*;
import Modelo.Medicamentos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EROSMATIAS
 */
public class Ctrl_Medicamento {
     String archivo = "Inventario.txt";
    String separador = ",";

    private ArrayList<Medicamentos> lstMedicamentos = new ArrayList<>();

    public Ctrl_Medicamento() {
        lstMedicamentos = new ArrayList<>();
        leer();
        cargarDatosMedicamentos();
    }

    public void agregar(Medicamentos medicamento) {
        lstMedicamentos.add(medicamento);
        guardar();
        guardarDatosMedicamentos();
    }

    public void eliminar(String medicamento) {
        Medicamentos actual = buscar(medicamento);
        if (actual != null) {
            
            guardar();
            guardarDatosMedicamentos();
  
        }
    }

    public void eliminar(Medicamentos medicamento) {
    lstMedicamentos.remove(medicamento);
    guardar();
    guardarDatosMedicamentos();
}
  public Medicamentos buscar(String nombremedicamento) {
       for (Medicamentos m : lstMedicamentos) {
        if (m.getMedicina().equalsIgnoreCase(nombremedicamento)) {
            return m;
        }
    }
    return null;
}

    public void modificar(Medicamentos medicamento) {
   Medicamentos actual = buscar(medicamento.getMedicina());
    if (actual != null) {
        actual.setCantidad(medicamento.getCantidad());
        actual.setPrecio(medicamento.getPrecio());
        guardar();
        guardarDatosMedicamentos();
    }
    }

    public void mostrarEnTabla(DefaultTableModel registro) {
       registro.setRowCount(0);
    for (Medicamentos m : lstMedicamentos) {
        registro.addRow(new Object[]{
            m.getId(),
            m.getMedicina(),
            m.getCantidad(),
            m.getPrecio()
        });
    }
    }

    private void guardar() {
        try {
            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            for (Medicamentos m : lstMedicamentos) {
                String linea
                        = m.getMedicina() + separador
                        + m.getCantidad() + separador
                        + m.getPrecio() + separador;

                pw.println(linea);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("Error al guardar datos");
        }

    }

    private void guardarDatosMedicamentos() {
    try {
        FileWriter fw = new FileWriter("medicamentos.txt");
        PrintWriter pw = new PrintWriter(fw);
        for (Medicamentos med : lstMedicamentos) {
            pw.println(med.getMedicina() + "," + med.getCantidad() + "," + med.getPrecio());
        }
        pw.close();
    } catch (IOException e) {
        System.err.println("Error al guardar datos de medicamentos: " + e.getMessage());
    }
}

private void cargarDatosMedicamentos() {
    try {
        FileReader fr = new FileReader("medicamentos.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        lstMedicamentos.clear();
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            Medicamentos med = new Medicamentos(datos[0], Integer.parseInt(datos[1]), Float.parseFloat(datos[2]));
            lstMedicamentos.add(med);
        }
        br.close();
    } catch (IOException e) {
        System.err.println("Error al cargar datos de medicamentos: " + e.getMessage());
    }
}

    private void leer() {
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            lstMedicamentos.clear();
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, separador);
                Medicamentos m = new Medicamentos();

                m.setMedicina(datos.nextToken());
                m.setCantidad(Integer.parseInt(datos.nextToken()));
                m.setPrecio(Float.parseFloat(datos.nextToken()));
                lstMedicamentos.add(m);

            }
        } catch (Exception e) {
            System.err.println("Error al listar datos");
            e.printStackTrace();
        }
    }
}
