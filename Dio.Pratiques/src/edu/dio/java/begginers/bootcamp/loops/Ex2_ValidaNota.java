package edu.dio.java.begginers.bootcamp.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_ValidaNota{
    public static void main(String [] args){
        Scanner Teclado = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Digite uma nota: ");
            nota = Teclado.nextInt();
            
            // Requisitos de uma nota válida.
            boolean notaValida = nota >= 0 && nota <= 10;

            if(notaValida) break;
            System.out.println("Nota inválida. Tente Novamente!");

        }while(true);
        System.out.println("Nota Válida!");
    }


}