/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_arreglos;

import java.util.Scanner;

/**
 *
 * @author melyssasolanodiaz
 */
public class practica_arreglos2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Lo creamos
        int[][] arregloA = new int[2][3];

        //Ingresar datos manualmente
        arregloA[0][0] = 3;
        arregloA[0][1] = 5;
        arregloA[0][2] = 3;

        arregloA[1][0] = 6;
        arregloA[1][1] = 8;

        // Mostramos lo que tenemos
        System.out.println(arregloA[0][0]);
        System.out.println(arregloA[1][2]); //No hemos ingresado un valor a dicha posicion

        //System.out.println(arregloA[10][10]); ERROR 
        //Imprimimos los datos
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println("La posicion (" + i + "," + j + ") tiene el valor " + arregloA[i][j]);

            }

        }

        //*********************************************************************
        //Creamos e ingresamos datos 
        int[][] arregloB = {{1, 2, 3, 4, 5},
        {1, 2, 3, 4, 5},
        {1, 2, 3, 4, 5}};

        //Obtener el tamaño de las filas 
        System.out.println(arregloB.length);

        //Obtener el tamaño de las columnas
        System.out.println(arregloB[0].length);

        //Imprimimos los datos
        for (int i = 0; i < arregloB.length; i++) {
            for (int j = 0; j < arregloB[0].length; j++) {
                System.out.println("La posicion (" + i + "," + j + ") tiene el valor " + arregloB[i][j]);
            }
        }

        //*********************************************************************
        //Lo creamos de otra forma
        int arregloC[][] = new int[2][3];

        //Ingresamos los datos
        for (int i = 0; i < arregloC.length; i++) {
            for (int j = 0; j < arregloC[0].length; j++) {
                System.out.println("Ingresa el valor de la posicion ( " + i + "," + j + ")");
                arregloC[i][j] = sc.nextInt();

            }

        }

    }

}
