/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto1;

import java.util.Scanner;

/**
 *
 * @author 76ersT
 */
public class punto2clasevectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamaniovector;
        System.out.println("Digite tamaño del vector: ");//pide el tamaño por teclado
        
        Scanner leerdatoteclado = new Scanner (System.in);//variable teclado
        tamaniovector= leerdatoteclado.nextInt();
        
        
        int[] vector = new int[tamaniovector]; // se inicializa el vector con un tamaño.
        for (int i = 0; i < vector.length; i ++) {
            
            System.out.println("Agregue un numero: ");
            vector[i]=leerdatoteclado.nextInt();
        }
        
        //imprime el vector
        System.out.println("Su vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }
        
        //ver los pares e impares
        int cuentapar=0;
        int cuentaimpar=0;
        
        
        
        
        for (int i = 0; i <vector.length; i++) {
            if (vector[i]%2==0) {///compara usando el modulo, es par
                cuentapar++;
     
            }else{
                cuentaimpar++;//de lo contrario es impar y siga acumulando
                
            }

        }
        
        //imprime el conteo de los numeros...
        System.out.println("Hay un total de: "+cuentapar+" numeros pares");
        System.out.println("Hay un total de: "+cuentaimpar+" numeros impares");
        //ya teniendo la cantidad, este será el tamaño de los nuevos vectore pares e impares.
        
        int[] vectorpar = new int[cuentapar]; // se inicializa el vector par con un tamaño.
        int[] vectorimpar = new int[cuentaimpar]; // se inicializa el vector impar con un tamaño.
        
        cuentapar=0;//inicar contador en cero!!!
        cuentaimpar=0;// contador en cero!!
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2==0) {
                vectorpar[cuentapar]=vector[i];//agrega al vector todos los pares
                cuentapar++;//acumulador
                
                
            }else{
                
                vectorimpar[cuentaimpar]=vector[i];///agrega al vector todos los impares
                cuentaimpar++;
                
            }
            
        }
        ////imprime los nuevos vectores; el par  y el impar:
        System.out.println("El nuevo vector de numero imppares es: ");
        for (int i = 0; i < vectorimpar.length; i++) {
            System.out.println(vectorimpar[i]);
            
        }
        System.out.println("El nievo vector de numeros pares es: ");
        
        for (int i = 0; i < vectorpar.length; i++) {
            System.out.println(vectorpar[i]);
            
        }



        
        
    }
    
}
