import pe.edu.upeu.SubProgramass;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.TecladoRead;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        SubProgramass objSP=new SubProgramass();
        EjemplosRecursivos objER=new EjemplosRecursivos();
        TecladoRead tr=new TecladoRead();
        //objSP.calcularFuncionExponecial();
        int numero=tr.read(0, "Introducir un Número: ");
    /*System.out.println("Factorial iterativo: "+objER.factorialBig(numero));
    System.out.println("Factorial Recursivo: "+objER.factorialBigRecur(numero));*/
    long ti=System.currentTimeMillis();
    System.out.println("Fibonaci iterativo: "+objER.fibonaci(numero));
    long tf=System.currentTimeMillis();
    System.out.println("Tiempo iterartivo:"+ (tf-ti));

    ti=System.currentTimeMillis();
    System.out.println("Fibonaci Recursivo: "+objER.fibonaciRecur(numero));
    tf=System.currentTimeMillis();
    System.out.println("Tiempo recursivo:"+ (tf-ti));

    }
}
