package pe.edu.upeu.emay;

import pe.edu.upeu.emay.examen.ResolucionExamen;
import pe.edu.upeu.emay.utils.TecladoRead;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        System.out.println("EJERCICIO REALIZADOS POR: EDWIN MIKY APAZA YANA: ");
        ResolucionExamen objEMAY=new ResolucionExamen();
        TecladoRead tr=new TecladoRead();
        System.out.println("EJERCICIO 02");
        objEMAY.ImpuestoPorAutomoviles();
        System.out.println("EJERCICIO 03");
        objEMAY.TablaDeMultiplicar();
        System.out.println("EJERCICIO 04");
        objEMAY.MuestraSiUnNumeroEsPerfecto();
        //objEMAY.NumerosPefectos();
        System.out.println("EJERCICIO 05");
        objEMAY.XElevadoalaN();
        System.out.println("EJERCICIO RECURSIVO 05");
        int x=tr.read(0, "Introducir un valor para x: ");
        int n=tr.read(0, "Introducir un valor para n: ");
        System.out.println("Ejercicio Recursivo:" +objEMAY.potencia(x, n));

    }
}
