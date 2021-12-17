
package ejerciciosjava;

/**
 *
 * @author esmer
 */
public class EjerciciosJava {
    
    public boolean fiestaArdillas(int bellotas, boolean finSemana){
        if (bellotas>=40&&bellotas<=60&&!finSemana){
            return true;
        }
        else if ((bellotas<=40||bellotas>=60)&&!finSemana){
            return false;
        }
        else{
        return true;
        }
    }

    public static void main(String[] args) {
         EjerciciosJava ejercicio = new EjerciciosJava();
         System.out.println( "Fiesta Ardillas");
         System.out.println("40, true: "+ ejercicio.fiestaArdillas(40, true));
         System.out.println( "50, false: "+ejercicio.fiestaArdillas(50, false));
         System.out.println( "20, true: "+ejercicio.fiestaArdillas(20, true));
         System.out.println( "90, false: "+ejercicio.fiestaArdillas(90, false));
    }
    
}
