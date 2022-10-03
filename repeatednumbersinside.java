/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto1;
import java.util.Scanner;

/**
 *
 * @author 76ersTvbradcsk7
 */
public class claseprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerodimensionarray;
        System.out.println("Digite número de posiciones del array: ");//pide la dimension por teclado puede ser de 20 posiciones o de n+1
        
        Scanner leerdatoteclado = new Scanner (System.in);//variable teclado
        numerodimensionarray= leerdatoteclado.nextInt();//captura de datos
        
        
        int arrayallenar[] = new int[numerodimensionarray]; // se inicializa el array con un tamaño.
        for (int i = 0; i < arrayallenar.length; i ++) {//ciclo para llenar array dada la dimension
            
            System.out.println("Agregue un numero: ");
            arrayallenar[i]=leerdatoteclado.nextInt();//llena array por teclado
        }
        
        
        
        
        
        
        for (int i = 0; i < arrayallenar.length; i++) {// se imprime el array con un for
            System.out.println("Su arreglo es: ");
            System.out.println(arrayallenar[i]+" ");//imprime el array
        }
        
        System.out.println("Numero que desea buscar: ");
        int numeroabuscar= leerdatoteclado.nextInt();//recibe parametros

        System.out.println("Cantidad de números repetidos: ");
        int conteoderepetidos=0;//inicia un contador en cero!
        
        
        for (int i = 0; i < arrayallenar.length; i ++) {// recorre el array completo
            
            if(arrayallenar[i]==numeroabuscar){//si el numero a buscar se encuentra dentro del arreglo
                conteoderepetidos++;//lo agrega/acumula en el contador
                
                }
        }
        
        System.out.println("Hay "+conteoderepetidos+" veces el número "+numeroabuscar);//imprime el resultado


        
        
        
            
        
    }
    
}
