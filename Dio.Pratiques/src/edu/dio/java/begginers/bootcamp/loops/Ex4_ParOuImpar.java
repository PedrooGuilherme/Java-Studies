package edu.dio.java.begginers.bootcamp.loops;

import java.util.Scanner;

public class Ex4_ParOuImpar {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        int quantidadPar = 0,quantidadImpar = 0,quantidadNumeros,count = 1;

        System.out.print("Quantidade de Números ? \n>> ");
        quantidadNumeros = teclado.nextInt();

        while(count <= quantidadNumeros){
        	
            System.out.print(count+"° Númemo: ");
            int numero = teclado.nextInt();
            // Requisitos para um valor ser par.
            boolean Par = numero %2 == 0;
            
            if(Par) quantidadPar++;
            else quantidadImpar++;
            
            count++;
        }
        System.out.println("Números Pares: "+ quantidadPar);
        System.out.println("Números Impares: "+ quantidadImpar);


        
    }
}
