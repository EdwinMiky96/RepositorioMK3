package pe.edu.upeu.arreglos;

import java.util.Scanner;

public class EjemplosVectores {

    public static void conceptosVectores() {
        //Definir un vectores
        int[] vectorX;
        int   []vectorY;
        //Definir tamaño de un vector
        vectorX = new int[2];
        vectorX[0]=20;//[0] indice/posicion
        vectorX[1]=0;//[1] indice/posicion
        vectorX[0]=40;
        //vectorX[2]=5;
        System.out.println("Imprimiendo valores del vector");
        System.out.println(vectorX[0]); //imprimiendo valor/elemntodel vector vectorX[0]
        //Asignando valores directos a un vector
        int[] vA={12,2,3,4,5,6,7,8,9,10};
        int[] vB=new int[]{12,2,3,4,5,6,7,8,9,10, 45, 16, 32};
        //conocer el tamaño de un vector
        System.out.println("Tamanho/longitud del vector vB="+vB.length);


    }

    public static void posiciones(){
        final int tam=10;
        int num[]=new int[tam];
        rellenarArray(num);
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<lista.length;i++){
            System.out.println("Introduce 10 Números");
            lista[i]=sc.nextInt();
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
    

    public static void main(String[] args) {
        //conceptosVectores();
        posiciones();
    }
    
}
