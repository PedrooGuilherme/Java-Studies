package edu.dio.java.begginers.bootcamp.loops;

import java.util.Scanner;
/**<h2> Classe MaiorEMedia </h2>
*<p>Classe responsável por fazer a leitura de 5 números
*e informar o maior número
*e a média entre eles.</p>
*/
public class Ex3_MaiorEMedia{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int soma = 0,maior = 0,count = 1; 
        double media;
        
        while(count <= 5){
            System.out.print("Digite o "+ count +"° número: ");
            int numero = teclado.nextInt();

            // Número Maior
            if(numero > maior) maior = numero;

            // Soma dos valores para efetuar média
            soma +=numero;

            count ++;
        }
        media = (double)soma/5;
        System.out.println("Número Maior : "+maior);
        System.out.println("Média dos Números : "+ media);
    }
}

