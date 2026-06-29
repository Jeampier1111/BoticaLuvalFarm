
package Control;

public class Funcionalidad {

    public static void main(String[] args) {
        
        int funcionesEspecificadas = 5; // número de funciones que se deben implementar
        int funcionesImplementadas = 5; // número de funciones que están implementadas correctamente

        int N_f = funcionesEspecificadas;
        int N_i = funcionesEspecificadas - funcionesImplementadas;

        double A = (double) (N_f - N_i) / N_f;

        System.out.println("Completitud funcional (A): " + A);
    }
}
