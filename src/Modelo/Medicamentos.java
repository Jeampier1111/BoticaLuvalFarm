
package Modelo;

import Modelo.*;

public class Medicamentos {
    private int id;
    private static int contador = 1;
    String medicina;
    int cantidad;
    float precio;

    public Medicamentos() {
         this.id = contador++;
    }

    public Medicamentos(String medicina, int cantidad, float precio) {
        this.id = contador++;
        this.medicina = medicina;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }
   
    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
   
    
    public float ventas(){
        return getCantidad()*getPrecio();
    }
    
    
    
}

