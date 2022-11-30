package edu.dio.java.begginers.bootcamp.loops;
import java.util.Scanner;

public class Ex1_NomeEIdade{
/*
    Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome)
*/
    public static void main(String [] args){
        String nome;
        int idade;
        Scanner Teclado = new Scanner(System.in);

        while(true){
        System.out.print("Digite seu nome: ");
        nome = Teclado.next();
        if(nome.equals("0")){

            break;

        }
        
        System.out.print("Digite sua idade: ");
        idade = Teclado.nextInt();

        System.out.println("Digite 0 no nome para finalizar o programa!");
        }
        System.out.println("Fim do programa...");




    }
}