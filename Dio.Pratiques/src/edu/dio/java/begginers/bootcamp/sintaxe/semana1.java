package edu.dio.java.begginers.bootcamp.sintaxe;



import java.util.Scanner;

public class semana1 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		/*String primeiroNome;
		String segundoNome;
		
		
		
		System.out.println("Digite seu primeiro nome: ");
		primeiroNome = Teclado.next();
		
		System.out.println("Digite seu segundo nome: ");
		segundoNome = Teclado.next();
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		
		return "Seu nome completo é: " + primeiroNome.concat(" ").concat(segundoNome);
	}
	*/
		float somaNotas =0;
		
		
		for(int i = 1 ; i <= 3;i++) {
			System.out.printf("Digite a %d ° nota: ",i);
			somaNotas += Teclado.nextInt();
			
		}
		float media = somarMedia(somaNotas);
		System.out.printf("Média das notas: %.1f",media);
	
	}
	public static float somarMedia(float somaNotas)
	{
		return somaNotas/ 3;
	}
}
