package practica_arreglos;

import java.util.Scanner;

/**
 *
 * @author melyssasolanodiaz
 */
public class Practica_arreglos1 {

    public static void main(String[] args) {
        
        Interfaz interfaz= new Interfaz();
        interfaz.setVisible(true);
        
        Scanner sc = new Scanner(System.in);

        //Lo creamos
        int[] arregloA = new int[10];

        //Ingresar datos manualmente
        arregloA[0] = 3;
        arregloA[1] = 5;
        arregloA[2] = 7;
        arregloA[3] = 9;
        arregloA[4] = 10;

        // Mostramos lo que tenemos
        System.out.println(arregloA[0]);
        System.out.println(arregloA[9]); //No hemos ingresado un valor a dicha posicion

        //System.out.println(arregloA[10]); ERROR 
        //Imprimimos los datos
        for (int i = 0; i < 5; i++) {
            System.out.println("La posicion " + i + " tiene el valor " + arregloA[i]);
        }

        
        
        
        //*********************************************************************
        
        
        //Creamos e ingresamos datos 
        int[] arregloB = {1, 2, 3, 4, 5};

        //Obtener el tamaño del vector
        System.out.println(arregloB.length);

        //Imprimimos los datos
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("La posicion " + i + " tiene el valor " + arregloB[i]);
        }

        //*********************************************************************
        
        
        
        
        //Lo creamos de otra forma
        int arregloC[] = new int[10];

        //Ingresamos los datos
        for (int i = 0; i < arregloC.length; i++) {
            System.out.println("Ingresa el valor " + i);
            arregloC[i] = sc.nextInt();
        }
        
       

    }

}
