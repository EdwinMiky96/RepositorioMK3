package pe.edu.upeu.emay.examen;

import pe.edu.upeu.emay.utils.TecladoRead;

public class ResolucionExamen {

    TecladoRead teclado = new TecladoRead();

    public void ImpuestoPorAutomoviles() {
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        
        n = teclado.read(0,"Ingresa el valor de n: ");
        
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            
            clave = teclado.read(0, " Ingresa el valor de clave: ");
            
            costo = teclado.read(0, "Ingresa el valor de costo: ");

            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);

    }

    public void TablaDeMultiplicar() {
        int i, numero, resultado;
        numero = teclado.read(0, "Ingrese un numero a Multiplicar: ");
        System.out.println();
        for (i=1; i<=10; i++) {
            resultado = i * numero;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println();
    }

    public void MuestraSiUnNumeroEsPerfecto() {

        int divisor, numero, suma = 1;
        numero = teclado.read(0, "Ingrese el Numero para saber si es perfecto o no: ");
        System.out.print("1");
        for (divisor=2; divisor<numero; divisor++)
            if (numero%divisor==0)
            {
                System.out.print(" + " + divisor);
                suma += divisor;
            }
        System.out.println(" = " + suma);
        if (suma==numero)
            System.out.println("El numero " + numero + " si es perfecto.");
        else
            System.out.println("El numero " + numero + " no es perfecto.");
    }

    public void NumerosPefectos() {
        int np=1;
        String numerosp="";
        int n=1;
        int suma=0;
        while(np<5) {
            n++;
            for(int x=1;x<n;x++){
                if(n%x==0) {
                   suma=suma+x;
                }
            }
            if(suma==n) {
                np=np+1;
                numerosp=numerosp+suma+",";
                suma=0;
            }
            else {
                System.out.println(n+" no es Perfecto");
                suma=0;
            }
        }
        System.out.println("Numeros Perfectos: "+numerosp);
    }

    public void XElevadoalaN() {
        int n;
        double x;
        x = teclado.read(0, "Valor de x :");
        do {
            n = teclado.read(0, "valor de n : ");
        } 
        while (n <= 0);
        System.out.println(x + " elevado a la " + n + " es igual a " + potencia(x, n));

    }

    public double potencia(double x, double n) {
        if (n == 0) {
            return 1;
        } 
        else {
            return x * potencia(x, n - 1);
        }
    }

}
